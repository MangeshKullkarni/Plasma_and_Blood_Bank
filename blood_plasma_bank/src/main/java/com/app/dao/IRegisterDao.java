package com.app.dao;

import com.app.pojos.Address;
import com.app.pojos.Doner;
import com.app.pojos.Hospital;
import com.app.pojos.Reciver;

public interface IRegisterDao {

	String registerHospital(Address add, Hospital hospital);

	String registerDoner(Doner d);

	String registerReciver(Reciver r);
	

}
