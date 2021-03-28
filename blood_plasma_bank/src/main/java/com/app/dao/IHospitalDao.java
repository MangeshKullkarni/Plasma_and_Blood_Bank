package com.app.dao;

import java.util.List;

import com.app.pojos.Hospital;

public interface IHospitalDao {

	List<Hospital> fetchAllHospitals();

	String delete(int hid);

	Hospital findHospitalById(int hid);

	String updateHospital(int id, String name, String mobileNo, String email, String registrationId, String city,
			String state, String district, String street, int pincode, String country);

}
