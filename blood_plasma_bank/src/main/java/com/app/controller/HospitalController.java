package com.app.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Admin;
import com.app.pojos.Hospital;
import com.app.pojos.HospitalRequest;
import com.app.service.ILoginService;
import com.app.service.IRegisterService;
import com.app.service.IRequesterService;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private ILoginService loginService;
	@Autowired
	private IRequesterService requesterService;

	public HospitalController() {
		System.out.println("in constr of " + getClass().getName());
	}

	@GetMapping("/login")
	public String showLogin() {
		return "/hospital/login";
	}

	@PostMapping("/login")
	public String processLogin(@RequestParam String email, @RequestParam String password, HttpSession hs,
			RedirectAttributes flashMap, Model modelMap) {
		System.out.println("in process Login " + email + " " + password);
		try {
			hs.setAttribute("hospitalDetails", loginService.validateHospital(email, password));
			return "redirect:/hospital/hospital_dashboard";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "Invalid Login Details");
			return "/hospital/login";
		}
	}

	@GetMapping("/hospital_dashboard")
	public String showDashboard() {
		return "/hospital/hospital_dashboard";
	}

	@GetMapping("/send_request")
	public String showSendRequest() {
		return "/hospital/send_request";
	}

	@PostMapping("/send_request")
	public String processSendRequest(@RequestParam String type, @RequestParam String group, @RequestParam int quantity,
			@RequestParam String lastDate, @RequestParam String hospitalName, @RequestParam String employerName,
			@RequestParam String requesterRemark, RedirectAttributes flashMap, Model modelMap, HttpSession hs) {

		HospitalRequest hr = new HospitalRequest(type, group, quantity, LocalDate.parse(lastDate), hospitalName,
				employerName, LocalDate.now(), "requested", null, requesterRemark, null);
		try {
			flashMap.addFlashAttribute("message", requesterService.saveRequest(hr));
			return "redirect:/hospital/hospital_dashboard";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOme Error Occoured");
			return "/hospital/send_request";
		}
	}

	@GetMapping("/request_status")
	public String showRequestStatus(RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {
			Hospital h = (Hospital) hs.getAttribute("hospitalDetails");
			hs.setAttribute("requestList", requesterService.fetchMyRequests(h.getName()));
			return "/hospital/request_status";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "SOME ERROR OCCOURED");
			return "/hospital/request_status";
		}
	}

	@GetMapping("/request_delete")
	public String requestDelete(@RequestParam int rid, RedirectAttributes flashMap, Model modelMap, HttpSession hs) {
		try {
			flashMap.addFlashAttribute("message", requesterService.deleteRequest(rid));
			return "redirect:/hospital/request_status";
		} catch (RuntimeException e) {
			modelMap.addAttribute("message", "some error occoured");
			return "/hospital/request_status";
		}
	}

}
