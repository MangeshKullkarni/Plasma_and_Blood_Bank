package com.app.service;

import java.util.List;

import com.app.pojos.BloodRequest;
import com.app.pojos.HospitalRequest;

public interface IRequesterService {

	String saveRequest(HospitalRequest hr);

	List<HospitalRequest> fetchMyRequests(String name);

	String deleteRequest(int rid);

	List<HospitalRequest> fetchRequest();

	HospitalRequest fetchRequestById(int rid);

	String updateRequest(int rid, int quantity, String status, String avaliblityDate, String bankRemark);

	String bloodRequestSend(BloodRequest b);

	String updateBloodRequest(int rid, int quantity, String status, String avaliblityDate, String bankRemark);

}
