package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IHospitalDao;
import com.app.pojos.Hospital;
@Service
@Transactional
public class HospitalServiceImp implements IHospitalService {

	@Autowired
	private IHospitalDao hospitalDao;
	@Override
	public List<Hospital> fetchAllHospitals() {
		
		return hospitalDao.fetchAllHospitals();
	}
	@Override
	public String delete(int hid) {
		
		return hospitalDao.delete(hid);
	}
	@Override
	public Hospital findHospitalById(int hid) {
		
		return hospitalDao.findHospitalById(hid);
	}
	@Override
	public String updateHospital(int id, String name, String mobileNo, String email, String registrationId, String city,
			String state, String district, String street, int pincode, String country) {
		
		return hospitalDao.updateHospital(id, name, mobileNo, email,
				registrationId, city, state, district, street, pincode, country);
	}

}
