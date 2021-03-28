package com.app.service;

import com.app.pojos.Address;
import com.app.pojos.Doner;
import com.app.pojos.Hospital;
import com.app.pojos.HospitalRequest;
import com.app.pojos.Reciver;

public interface IRegisterService {

	String registerHospital(Address add, Hospital hospital);

	String registerDoner(Doner d);

	String registerReciver(Reciver r);

	

	
}
