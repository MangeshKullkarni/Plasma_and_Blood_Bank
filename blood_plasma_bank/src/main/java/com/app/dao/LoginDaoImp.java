package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Admin;
import com.app.pojos.Doner;
import com.app.pojos.Hospital;
import com.app.pojos.Reciver;

@Repository
public class LoginDaoImp implements ILoginDao {

	@Autowired
	private EntityManager mgr;

	@Override
	public Admin validateAdmin(String email, String password) {
		String jpql="select a from Admin a where a.email=:email and a.password=:password";
		return mgr.createQuery(jpql, Admin.class).setParameter("email", email)
				.setParameter("password", password).getSingleResult();
	}

	@Override
	public Hospital validateHospital(String email, String password) {
		String jpql="select h from Hospital h where h.email=:email and h.password=:password";
		return mgr.createQuery(jpql, Hospital.class).setParameter("email", email)
				.setParameter("password", password).getSingleResult();
	}

	@Override
	public Doner validateDoner(String email, String password) {
		String jpql="select d from Doner d where d.email=:email and d.password=:password";
		return mgr.createQuery(jpql, Doner.class).setParameter("email", email)
				.setParameter("password", password).getSingleResult();
	}

	@Override
	public Reciver validateReciver(String email, String password) {
		String jpql="select d from Reciver d where d.email=:email and d.password=:password";
		return mgr.createQuery(jpql, Reciver.class).setParameter("email", email)
				.setParameter("password", password).getSingleResult();
	}
}
