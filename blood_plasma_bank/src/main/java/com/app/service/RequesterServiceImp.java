package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IRequesterDao;
import com.app.pojos.BloodRequest;
import com.app.pojos.HospitalRequest;

@Service
@Transactional
public class RequesterServiceImp implements IRequesterService {

	@Autowired
	private IRequesterDao requesterDao;

	@Override
	public String saveRequest(HospitalRequest hr) {
		
		return requesterDao.saveRequest(hr);
	}

	@Override
	public List<HospitalRequest> fetchMyRequests(String name) {
	
		return requesterDao.fetchMyRequests(name);
	}

	@Override
	public String deleteRequest(int rid) {
		// TODO Auto-generated method stub
		return requesterDao.deleteRequest(rid);
	}

	@Override
	public List<HospitalRequest> fetchRequest() {
		// TODO Auto-generated method stub
		return requesterDao.fetchRequest();
	}

	@Override
	public HospitalRequest fetchRequestById(int rid) {
		// TODO Auto-generated method stub
		return requesterDao.fetchRequestById(rid);
	}

	@Override
	public String updateRequest(int rid, int quantity, String status, String avaliblityDate, String bankRemark) {
		
		return requesterDao.updateRequest(rid,quantity,status,avaliblityDate,bankRemark);
	}

	@Override
	public String bloodRequestSend(BloodRequest b) {
		// TODO Auto-generated method stub
		return requesterDao.bloodRequestSend(b);
	}

	@Override
	public String updateBloodRequest(int rid, int quantity, String status, String avaliblityDate, String bankRemark) {
		// TODO Auto-generated method stub
		return requesterDao.updateBloodRequest(rid,quantity,status,avaliblityDate,bankRemark);
	}

}
