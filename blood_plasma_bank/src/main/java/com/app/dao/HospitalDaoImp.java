package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Address;
import com.app.pojos.Hospital;
@Repository
public class HospitalDaoImp implements IHospitalDao {

	@Autowired
	private EntityManager mgr;
	@Override
	public List<Hospital> fetchAllHospitals() {
		String jpql="select h from Hospital h";
		return mgr.createQuery(jpql, Hospital.class).getResultList();
	}
	@Override
	public String delete(int hid) {
		Hospital h=mgr.find(Hospital.class, hid);
		mgr.remove(h);
		return "Hospital is removed";
	}
	@Override
	public Hospital findHospitalById(int hid) {
		return mgr.find(Hospital.class, hid);
	}
	@Override
	public String updateHospital(int id, String name, String mobileNo, String email, String registrationId, String city,
			String state, String district, String street, int pincode, String country) {
		Hospital h=mgr.find(Hospital.class, id);
		h.setName(name);
		h.setEmail(email);
		h.setMobileNo(mobileNo);
		h.setRegistrationDate(LocalDate.now());
		h.setRegistrationId(registrationId);
		Address a=mgr.find(Address.class, h.getAddress().getId());
		a.setCity(city);
		a.setState(state);
		a.setStreet(street);
		a.setPincode(pincode);
		a.setCountry(country);
		a.setDistrict(district);
		return "update IS successed";
	}

}
