package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.BloodRequest;
import com.app.pojos.HospitalRequest;

@Repository
public class RequesterDaoImp implements IRequesterDao {
	@Autowired
	private EntityManager mgr;

	@Override
	public String saveRequest(HospitalRequest hr) {
		mgr.persist(hr);
		return "request Submited Successfully";
	}

	@Override
	public List<HospitalRequest> fetchMyRequests(String name) {
		String jpql = "select hr from HospitalRequest hr where hr.hospitalName=:name";
		return mgr.createQuery(jpql, HospitalRequest.class).setParameter("name", name).getResultList();
	}

	@Override
	public String deleteRequest(int rid) {
		HospitalRequest hr=mgr.find(HospitalRequest.class, rid);
		mgr.remove(hr);
		return "record is deleted";
	}

	@Override
	public List<HospitalRequest> fetchRequest() {
		String jpql="select hr from HospitalRequest hr";
		return mgr.createQuery(jpql, HospitalRequest.class).getResultList();
	}

	@Override
	public HospitalRequest fetchRequestById(int rid) {
		return mgr.find(HospitalRequest.class, rid);
	}

	@Override
	public String updateRequest(int rid, int quantity, String status, String avaliblityDate, String bankRemark) {
		HospitalRequest hs=mgr.find(HospitalRequest.class, rid);
		hs.setAvaliblityDate(LocalDate.parse(avaliblityDate));
		hs.setBankRemark(bankRemark);
		hs.setStatus(status);
		hs.setQuantity(quantity);
		return "request Update";
	}

	@Override
	public String bloodRequestSend(BloodRequest b) {
		mgr.persist(b);
		return "Blood Request Send";
	}

	@Override
	public String updateBloodRequest(int rid, int quantity, String status, String avaliblityDate, String bankRemark) {
		BloodRequest hs=mgr.find(BloodRequest.class, rid);
		hs.setAvaliblityDate(LocalDate.parse(avaliblityDate));
		hs.setBankRemark(bankRemark);
		hs.setStatus(status);
		hs.setQuantity(quantity);
		return "request Update";
	}

}
