package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.BloodCamp;
import com.app.pojos.BloodRequest;
import com.app.pojos.CampAttendance;
import com.app.pojos.Doner;
import com.app.pojos.Reciver;
import com.app.service.IBloodCampService;
import com.app.service.ILoginService;
import com.app.service.IRegisterService;
import com.app.service.IRequesterService;

import net.bytebuddy.asm.Advice.Local;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IRegisterService registerService;
	@Autowired
	private ILoginService loginService;
	@Autowired
	private IBloodCampService bloodCampService;
	@Autowired
	private IRequesterService requestService;
	public UserController() {
		System.out.println("in constr of " + getClass().getName());
	}

	@GetMapping("/donerregistration")
	public String showDonerregistration() {
		return "/user/donerregistration";
	}

	@PostMapping("/donerregistration")
	public String processRegistration(@RequestParam String name, @RequestParam String email,
			@RequestParam String password, @RequestParam String gender, @RequestParam String dateOfBirth,
			@RequestParam String fluidType, @RequestParam String group, @RequestParam String mobileNo,
			@RequestParam String confirmPassword, RedirectAttributes flashMap, HttpSession hs, Model modelMap) {
		try {
			if (password.equals(confirmPassword)) {
				Doner d = new Doner(name, email, confirmPassword, gender, LocalDate.parse(dateOfBirth), fluidType,
						group, mobileNo);
				flashMap.addFlashAttribute("message", registerService.registerDoner(d));
				return "redirect:/user/donerlogin";
			} else {
				modelMap.addAttribute("message", "Password Not Matched");
				return "/user/donerregistration";
			}
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoured");
			return "/user/donerregistration";

		}
	}

	@GetMapping("/donerlogin")
	public String showLogin() {
		return "/user/donerlogin";
	}

	@PostMapping("/donerlogin")
	public String processLogin(@RequestParam String email, @RequestParam String password, RedirectAttributes flashMap,
			Model modelMap, HttpSession hs) {
		try {
			hs.setAttribute("donerDetails", loginService.validateDoner(email, password));
			return "redirect:/user/doner_dashboard";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "invalid Email password");
			return "/user/donerlogin";
		}
	}

	@GetMapping("/doner_dashboard")
	public String showDonerDashboard(HttpSession hs) {
		Doner d = (Doner) hs.getAttribute("donerDetails");
		hs.setAttribute("upcommingCampDetails", bloodCampService.listOfUpcommingCamp());
		hs.setAttribute("attendedCount", bloodCampService.attendedCount(d.getName()));
		hs.setAttribute("upcommingCount", bloodCampService.upcommingCount());
		return "/user/doner_dashboard";
	}

	@GetMapping("/upcommingCamp")
	public String showupcommingCamp(HttpSession hs, RedirectAttributes flashMap, Model modelMap) {
		try {
			List<BloodCamp> bList = bloodCampService.listOfUpcommingCamp();
			hs.setAttribute("campList", bList);
			return "/user/upcommingCamp";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "no Upcomming Camps");
			return "/user/upcommingCamp";
		}

	}

	@GetMapping("/attendedCamp")
	public String showAttendedCampResult(HttpSession hs, RedirectAttributes flashMap, Model model) {
		Doner d = (Doner) hs.getAttribute("donerDetails");
		List<CampAttendance> ca = bloodCampService.donerHistory(d.getName());
		if (ca != null)
			hs.setAttribute("donerAttendedList", ca);
		model.addAttribute("message", "Records Not Found");
		return "/user/attendedCamp";
	}

	@GetMapping("/reciverregistration")
	public String showRRegistration() {
		return "/user/reciverregistration";
	}

	@PostMapping("/reciverregistration")
	public String processRRegistration(@RequestParam String name, @RequestParam String email,
			@RequestParam String password, @RequestParam String gender, @RequestParam String dateOfBirth,
			@RequestParam String fluidType, @RequestParam String group, @RequestParam String mobileNo,
			@RequestParam String confirmPassword, RedirectAttributes flashMap, HttpSession hs, Model modelMap) {
		try {
			if (password.equals(confirmPassword)) {
				Reciver r = new Reciver(name, email, confirmPassword, gender, LocalDate.parse(dateOfBirth), fluidType,
						group, mobileNo);
				flashMap.addFlashAttribute("message", registerService.registerReciver(r));
				return "redirect:/user/reciverLogin";
			} else {
				modelMap.addAttribute("message", "Password Not Matched");
				return "/user/reciverregistration";
			}
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoured");
			return "/user/reciverregistration";

		}
	}

	@GetMapping("/reciverLogin")
	public String showRLogin() {
		return "/user/reciverLogin";
	}

	@PostMapping("/reciverLogin")
	public String processRLogin(@RequestParam String email, @RequestParam String password, RedirectAttributes flashMap,
			Model modelMap, HttpSession hs) {
		try {
			hs.setAttribute("reciverDetails", loginService.validateReciver(email, password));
			return "redirect:/user/reciver_dashboard";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "invalid Email password");
			return "/user/reciverLogin";
		}
	}

	@GetMapping("/reciver_dashboard")
	public String showRDashboard() {
		return "/user/reciver_dashboard";
	}

	@GetMapping("/requestBlood")
	public String showRequestBlood() {
		return "/user/requestBlood";
	}

	@PostMapping("/requestBlood")
	public String processBloodRequest(@RequestParam String type,@RequestParam String group,@RequestParam int quantity,@RequestParam String lastDate,@RequestParam String requesterName,
			@RequestParam String requesterRemark,RedirectAttributes flashMap,Model  modelMap,HttpSession hs) {
		try {
			
			BloodRequest b=new BloodRequest(type, group, quantity, LocalDate.parse(lastDate), requesterName, LocalDate.now(), "Requested", null, requesterRemark, null);
			flashMap.addFlashAttribute("message", requestService.bloodRequestSend(b));
			return "redirect:/user/reciver_dashboard";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoured");
			return "/user/requestBlood";
		}
	}
	@GetMapping("/requestStatus")
	public String showMyRequestStatus(HttpSession hs,Model modelMap,RedirectAttributes flashMap) {
		try {
			Reciver r=(Reciver) hs.getAttribute("reciverDetails");
			hs.setAttribute("requestDetails", bloodCampService.fetctMyrequests(r.getName()));
			return "/user/requestStatus";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/user/requestStatus";
		}
	}
}
