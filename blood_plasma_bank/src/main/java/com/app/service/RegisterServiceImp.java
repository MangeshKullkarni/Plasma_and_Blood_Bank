package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IRegisterDao;
import com.app.pojos.Address;
import com.app.pojos.Doner;
import com.app.pojos.Hospital;
import com.app.pojos.HospitalRequest;
import com.app.pojos.Reciver;

@Service
@Transactional
public class RegisterServiceImp implements IRegisterService {

	@Autowired
	private IRegisterDao registerDao;
	
	@Override
	public String registerHospital(Address add, Hospital hospital) {
		
		return registerDao.registerHospital(add,hospital);
	}

	@Override
	public String registerDoner(Doner d) {
		// TODO Auto-generated method stub
		return registerDao.registerDoner(d);
	}

	@Override
	public String registerReciver(Reciver r) {
		// TODO Auto-generated method stub
		return registerDao.registerReciver(r);
	}

	
}
