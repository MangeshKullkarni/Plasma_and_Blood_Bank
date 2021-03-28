package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Address;
import com.app.pojos.BloodCamp;
import com.app.pojos.BloodRequest;
import com.app.pojos.CampAttendance;

@Repository
public class BloodCampDaoImp implements IBloodCampDao {

	@Autowired
	private EntityManager mgr;

	@Override
	public String createNewCamp(Address add, BloodCamp bloodC) {
		bloodC.setAddress(add);
		mgr.persist(bloodC);
		return "New Camp is Arranged On Date " + bloodC.getCampDate();
	}

	@Override
	public List<BloodCamp> fetchBloodCamp() {
		String jpql = "select bc from BloodCamp bc";
		return mgr.createQuery(jpql, BloodCamp.class).getResultList();
	}

	@Override
	public String removeCamp(int cid) {
		BloodCamp b = mgr.find(BloodCamp.class, cid);
		mgr.remove(b);
		return "Camp is Cancled / Removed From List";
	}

	@Override
	public List<BloodCamp> listOfUpcommingCamp() {
		LocalDate today = LocalDate.now();
		String jpql = "select bc from BloodCamp bc where bc.campDate >:today order by bc.campDate desc";
		List<BloodCamp> b = mgr.createQuery(jpql, BloodCamp.class).setParameter("today", today).getResultList();
		if (b != null)
			return b;
		else
			return null;
	}

	@Override
	public String addDonerRecored(CampAttendance ca) {

		mgr.persist(ca);
		LocalDate today = LocalDate.now();
		String jpql = "select ca from CampAttendance ca where ca.campDate=:today";
		List<CampAttendance> c = mgr.createQuery(jpql, CampAttendance.class).setParameter("today", today)
				.getResultList();
		int count = 0;
		for (CampAttendance ct : c) {
			count++;
		}
		return "Doner Information is Stored Todayes Count Is" + count;
	}

	@Override
	public List<CampAttendance> donerHistory(String name)throws NullPointerException {
		
		String jpql = "select ca from CampAttendance ca where ca.donerName=:name";
		List<CampAttendance> c = mgr.createQuery(jpql, CampAttendance.class).setParameter("name",name).getResultList();
		if (c != null)
			return c;
		return null;
	}

	@Override
	public int attendedCount(String name) {
		String jpql = "select ca from CampAttendance ca where ca.donerName=:name";
		List<CampAttendance> c = mgr.createQuery(jpql, CampAttendance.class).setParameter("name",name).getResultList();
		int count=0;
		for(CampAttendance ca:c) {
			count ++;
		}
			return count;
	}

	@Override
	public int upcommingCount() {
		LocalDate today = LocalDate.now();
		String jpql = "select bc from BloodCamp bc where bc.campDate >:today order by bc.campDate desc";
		List<BloodCamp> b = mgr.createQuery(jpql, BloodCamp.class).setParameter("today", today).getResultList();
		int count=0;
		for(BloodCamp ba:b) {
			count++;
		}
		return count;
	}

	@Override
	public List<BloodRequest> fetchBloodRequest() {
	String jpql="select br from BloodRequest br";
		return mgr.createQuery(jpql, BloodRequest.class).getResultList();
	}

	@Override
	public String deleteBloodRequest(int rid) {
		BloodRequest b=mgr.find(BloodRequest.class, rid);
		mgr.remove(b);
		return "request Deleted";
	}

	@Override
	public BloodRequest fetchRequestById(int rid) {
		
		return mgr.find(BloodRequest.class, rid);
	}

	@Override
	public List<BloodRequest> fetctMyrequests(String  name) {
		String jpql="select br from BloodRequest br where br.requesterName=:name";
		return mgr.createQuery(jpql, BloodRequest.class).setParameter("name", name).getResultList();
	}

}
