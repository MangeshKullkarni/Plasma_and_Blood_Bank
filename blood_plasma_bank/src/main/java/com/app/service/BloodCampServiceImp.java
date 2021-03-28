package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IBloodCampDao;
import com.app.dao.IBloodStockDao;
import com.app.pojos.Address;
import com.app.pojos.BloodCamp;
import com.app.pojos.BloodRequest;
import com.app.pojos.CampAttendance;

@Service
@Transactional
public class BloodCampServiceImp implements IBloodCampService {

	@Autowired
	private IBloodCampDao bloodCampDao;
	@Autowired
	private IBloodStockDao bloodStockDao;
	
	@Override
	public String createNewCamp(Address add, BloodCamp bloodC) {
		
		return bloodCampDao.createNewCamp(add,bloodC);
	}

	@Override
	public List<BloodCamp> fetchBloodCamp() {
	
		return bloodCampDao.fetchBloodCamp();
	}

	@Override
	public String removeCamp(int cid) {
		
		return bloodCampDao.removeCamp(cid);
	}

	@Override
	public List<BloodCamp> listOfUpcommingCamp() {
		// TODO Auto-generated method stub
		return bloodCampDao.listOfUpcommingCamp();
	}

	@Override
	public String addDonerRecored(CampAttendance ca) {
		bloodStockDao.increseCounts(ca.getType(), ca.getGroup(), ca.getQuantity());
		return bloodCampDao.addDonerRecored(ca);
	}

	@Override
	public List<CampAttendance> donerHistory(String name) {
		
		return bloodCampDao.donerHistory(name);
	}

	@Override
	public int attendedCount(String name) {
		// TODO Auto-generated method stub
		return bloodCampDao.attendedCount(name);
	}

	@Override
	public int upcommingCount() {
	
		return bloodCampDao.upcommingCount();
	}

	@Override
	public List<BloodRequest> fetchBloodRequest() {
		
		return bloodCampDao.fetchBloodRequest();
	}

	@Override
	public String deleteBloodRequest(int rid) {
		// TODO Auto-generated method stub
		return bloodCampDao.deleteBloodRequest(rid);
	}

	@Override
	public BloodRequest fetchRequestById(int rid) {
		// TODO Auto-generated method stub
		return bloodCampDao.fetchRequestById(rid);
	}

	@Override
	public List<BloodRequest> fetctMyrequests(String name) {
		// TODO Auto-generated method stub
		return bloodCampDao.fetctMyrequests(name);
	}

	
}
