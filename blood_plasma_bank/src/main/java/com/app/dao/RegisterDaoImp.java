package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Address;
import com.app.pojos.Doner;
import com.app.pojos.Hospital;
import com.app.pojos.Reciver;

@Repository
public class RegisterDaoImp implements IRegisterDao {

	@Autowired
	private EntityManager mgr;
	@Override
	public String registerHospital(Address add, Hospital hospital) {
		hospital.setAddress(add);
		mgr.persist(hospital);
		return "Hospital Is Registered With Id "+hospital.getId();
	}
	@Override
	public String registerDoner(Doner d) {
		mgr.persist(d);
		return "doner registration is Successed";
	}
	@Override
	public String registerReciver(Reciver r) {
		mgr.persist(r);
		return "Reciver registration is Successed";
	}

}
