package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILoginDao;
import com.app.pojos.Admin;
import com.app.pojos.Doner;
import com.app.pojos.Hospital;
import com.app.pojos.Reciver;

@Service
@Transactional
public class LoginServiceImp implements ILoginService {

	@Autowired
	private ILoginDao loginDao;

	@Override
	public Admin validateAdmin(String email, String password) {
		
		return loginDao.validateAdmin(email,password);
	}

	@Override
	public Hospital validateHospital(String email, String password) {
		
		return loginDao.validateHospital(email,password);
	}

	@Override
	public Doner validateDoner(String email, String password) {
		// TODO Auto-generated method stub
		return loginDao.validateDoner(email,password);
	}

	@Override
	public Reciver validateReciver(String email, String password) {
		// TODO Auto-generated method stub
		return loginDao.validateReciver(email,password);
	}
	
}
