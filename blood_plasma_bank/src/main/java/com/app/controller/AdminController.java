package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Address;
import com.app.pojos.Admin;
import com.app.pojos.BloodCamp;
import com.app.pojos.CampAttendance;
import com.app.pojos.Hospital;
import com.app.service.IBloodCampService;
import com.app.service.IBloodStockService;
import com.app.service.IHospitalService;
import com.app.service.ILoginService;
import com.app.service.IRegisterService;
import com.app.service.IRequesterService;

import lombok.Getter;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private ILoginService loginService;
	@Autowired
	private IRegisterService registerService;
	@Autowired
	private IBloodCampService bloodCampService;
	@Autowired
	private IHospitalService hospitalService;
	@Autowired
	private IBloodStockService bloodStockService;
	@Autowired
	private IRequesterService requesterService;

	public AdminController() {
		System.out.println("in constr of " + getClass().getName());
	}

	@GetMapping("/login")
	public String showLogin() {
		System.out.println("in show Login");
		return "/admin/login";
	}

	@PostMapping("/login")
	public String processLogin(@RequestParam String email, @RequestParam String password, HttpSession hs,
			RedirectAttributes flashMap, Model modelMap) {
		System.out.println("in process Login " + email + " " + password);
		Admin admin = loginService.validateAdmin(email, password);
		if (admin != null) {
			hs.setAttribute("adminDetails", admin);
			return "redirect:/admin/admin_dashboard";
		} else {
			modelMap.addAttribute("message", "Invalid Login Details");
			return "/admin/login";
		}
	}

	@GetMapping("/logout")
	public String userLogout(HttpSession session, Model modelMap, HttpServletRequest request,
			HttpServletResponse resp) {

		session.invalidate();

		resp.setHeader("refresh", "1;url=" + request.getContextPath());
		return "/index";

	}

	@GetMapping("/admin_dashboard")
	public String showAdminDashboard() {
		return "/admin/admin_dashboard";
	}

	@GetMapping("/hospital_registration")
	public String showHospitalRegistration() {
		return "/admin/hospital_registration";
	}

	@PostMapping("/hospital_registration")
	public String processHospitalRegistration(@RequestParam String name, @RequestParam String mobileNo,
			@RequestParam String email, @RequestParam String registrationId, @RequestParam String city,
			@RequestParam String state, @RequestParam String district, @RequestParam String street,
			@RequestParam int pincode, @RequestParam String country, HttpSession hs, RedirectAttributes flashMap,
			Model modelMap) {
		Address add = new Address(city, state, district, street, pincode, country);
		Hospital hospital = new Hospital(name, mobileNo, email, registrationId, LocalDate.now(), "hospital");
		try {
			flashMap.addFlashAttribute("message", registerService.registerHospital(add, hospital));
			return "redirect:/admin/show_hospitals";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoured");
			return "/admin/hospital_registration";
		}
	}

	@GetMapping("/arrange_camp")
	public String showArrangeCamp() {
		return "/admin/arrange_camp";
	}

	@PostMapping("/arrange_camp")
	public String processArrangeCamp(@RequestParam String title, @RequestParam String campDate,
			@RequestParam String purpose, @RequestParam String organiser, @RequestParam String organiserMobile,
			@RequestParam String startTime, @RequestParam String endTime, @RequestParam String city,
			@RequestParam String state, @RequestParam String district, @RequestParam String street,
			@RequestParam int pincode, @RequestParam String country, RedirectAttributes flashMap, HttpSession hs,
			Model modelMap) {
		Address add = new Address(city, state, district, street, pincode, country);
		BloodCamp bloodC = new BloodCamp(title, LocalDate.parse(campDate), purpose, organiser, organiserMobile,
				startTime, endTime);
		try {
			flashMap.addFlashAttribute("message", bloodCampService.createNewCamp(add, bloodC));
			return "redirect:/admin/camp_details";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/admin/arrange_camp";
		}
	}

	@GetMapping("/show_hospitals")
	public String showHospitalDetails(HttpSession hs, RedirectAttributes flashMap, Model modelMap) {
		List<Hospital> listOfHospitals = hospitalService.fetchAllHospitals();
		if (listOfHospitals != null) {
			System.out.println("list of hospitals " + listOfHospitals);
			hs.setAttribute("hospitalList", listOfHospitals);
			return "redirect:/admin/hospital_details";
		} else {
			modelMap.addAttribute("message", "Hospitals Are Not Yet Registered ");
			return "/admin/hospital_details";
		}
	}

	@GetMapping("/hospital_details")
	public String showHospitalsList() {
		return "/admin/hospital_details";
	}

	@GetMapping("/hospital_delete")
	public String deleteHospital(@RequestParam int hid, RedirectAttributes flashMap, Model modelMap) {
		try {
			flashMap.addFlashAttribute("message", hospitalService.delete(hid));
			return "redirect:/admin/show_hospitals";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoured");
			return "/admin/show_hospitals";
		}
	}

	@GetMapping("/hospitalUpdate")
	public String hospitalUpdate(@RequestParam int hid, RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {
			hs.setAttribute("hospitalDetails", hospitalService.findHospitalById(hid));
			return "redirect:/admin/hospital_update";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/admin/show_hospitals";
		}
	}

	@GetMapping("/hospital_update")
	public String hospitalUpdatePage() {
		return "/admin/hospital_update";
	}

	@PostMapping("/hospital_update")
	public String processHospitalUpdate(@RequestParam int id, @RequestParam String name, @RequestParam String mobileNo,
			@RequestParam String email, @RequestParam String registrationId, @RequestParam String city,
			@RequestParam String state, @RequestParam String district, @RequestParam String street,
			@RequestParam int pincode, @RequestParam String country, HttpSession hs, RedirectAttributes flashMap,
			Model modelMap) {
		try {
			flashMap.addFlashAttribute("message", hospitalService.updateHospital(id, name, mobileNo, email,
					registrationId, city, state, district, street, pincode, country));
			return "redirect:/admin/show_hospitals";
		} catch (Exception e) {
			modelMap.addAttribute("message", "SOME Error Occoured");
			return "/admin/hospital_update";
		}
	}

	@GetMapping("/add_stocks")
	public String showAddStocks(HttpSession hs) {
		hs.setAttribute("stocksList", bloodStockService.fetchStock());
		return "/admin/add_stocks";
	}

	@PostMapping("/add_stocks")
	public String processAddStocks(@RequestParam String type, @RequestParam String group, @RequestParam int quantity,
			RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {

			flashMap.addFlashAttribute("message", bloodStockService.increseCounts(type, group, quantity));
			return "redirect:/admin/add_stocks";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/admin/add_stocks";
		}
	}

	@GetMapping("/release_stocks")
	public String showReleaseStocks(HttpSession hs) {
		hs.setAttribute("stocksList", bloodStockService.fetchStock());
		return "/admin/release_stocks";
	}

	@PostMapping("/release_stocks")
	public String processReleaseStocks(@RequestParam String type, @RequestParam String group,
			@RequestParam int quantity, RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {

			flashMap.addFlashAttribute("message", bloodStockService.decreaseCounts(type, group, quantity));
			return "redirect:/admin/release_stocks";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/admin/release_stocks";
		}
	}

	@GetMapping("/camp_details")
	public String showCampDetails(HttpSession hs) {
		hs.setAttribute("campList", bloodCampService.fetchBloodCamp());
		return "/admin/camp_details";
	}

	@GetMapping("/camp_delete")
	public String deleteCamp(@RequestParam int cid, Model modelMap, RedirectAttributes flashMap, HttpSession hs) {
		try {
			flashMap.addFlashAttribute("message", bloodCampService.removeCamp(cid));
			return "redirect:/admin/camp_details";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/admin/camp_details";
		}
	}

	@GetMapping("/add_doner")
	public String showAddDoner() {
		return "/admin/add_doner";
	}

	@PostMapping("/add_doner")
	public String processAddDoner(@RequestParam String donerName, @RequestParam String donerDOB,
			@RequestParam String group, @RequestParam String type, @RequestParam int quantity,
			@RequestParam String campDate, @RequestParam String time, @RequestParam String mobieNO,
			RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {

			CampAttendance ca = new CampAttendance(donerName, LocalDate.parse(donerDOB), group, type, quantity,
					LocalDate.parse(campDate), time, mobieNO);
			flashMap.addFlashAttribute("message", bloodCampService.addDonerRecored(ca));
			return "/admin/add_doner";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/admin/add_doner";
		}
	}

	@GetMapping("/hospital_request")
	public String showHospitalRequest(HttpSession hs, RedirectAttributes flashMap, Model modelMap) {
		try {
			hs.setAttribute("hRequestList", requesterService.fetchRequest());
			return "/admin/hospital_request";

		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "error occoured");
			return "/admin/admin_dashboard";
		}
	}

	@GetMapping("/requestdelete")
	public String deleteRequest(@RequestParam int rid, RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {
			flashMap.addFlashAttribute("message", requesterService.deleteRequest(rid));
			return "/admin/hospital_request";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOme Error Occoured");
			return "/admin/hospital_request";
		}
	}

	@GetMapping("/requestUpdate")
	public String updateRequest(@RequestParam int rid, RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {
			hs.setAttribute("RequestDetails", requesterService.fetchRequestById(rid));
			return "/admin/request_update";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoured");
			return "/admin/hospital_request";
		}
	}

	@PostMapping("/requestUpdate")
	public String processUpdateRequest(@RequestParam int rid, @RequestParam int quantity, @RequestParam String status,
			@RequestParam String avaliblityDate, @RequestParam String bankRemark, Model modelMap,RedirectAttributes flashMap) {
		try {
			flashMap.addFlashAttribute("message", requesterService.updateRequest(rid,quantity,status,avaliblityDate,bankRemark));
			return "/admin/hospital_request";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoures");
			return "hospital_request?rid=" + rid;
		}
	}
	
	@GetMapping("/blood_request")
	public String showbloodRequest(HttpSession hs,Model modelMap) {
		try {
			hs.setAttribute("bloodRequest", bloodCampService.fetchBloodRequest());
			return "/admin/blood_request";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoures");
			return "/admin/blood_request";
		}
	}
	@GetMapping("/bloodrequestdelete")
	public String deleteRequest(@RequestParam int rid,Model modelMap,RedirectAttributes flashMap,HttpSession hs) {
		try {
			flashMap.addFlashAttribute("message", bloodCampService.deleteBloodRequest(rid));
			return "redirect:/admin/requester_request";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some error Occoured");
			return "/admin/requester_request";
		}
	}
	
	@GetMapping("/bloodrequestUpdate")
	public String bloodRequesstUpdate(@RequestParam int rid,Model modelMap,RedirectAttributes flashMapp,HttpSession hs) {
		try {
			hs.setAttribute("requestDetails", bloodCampService.fetchRequestById(rid));
			return "/admin/bloodrequestUpdate";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/admin/bloodrequestUpdate";
		}
	}

	@PostMapping("/bloodrequestUpdate")
	public String updateRequest(@RequestParam int rid, @RequestParam int quantity, @RequestParam String status,
			@RequestParam String avaliblityDate, @RequestParam String bankRemark, Model modelMap,RedirectAttributes flashMap) {
		try {
			flashMap.addFlashAttribute("message", requesterService.updateBloodRequest(rid,quantity,status,avaliblityDate,bankRemark));
			return "/admin/hospital_request";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Some Error Occoures");
			return "/admin/bloodrequestUpdate?rid=" + rid;
		}
	}
}
