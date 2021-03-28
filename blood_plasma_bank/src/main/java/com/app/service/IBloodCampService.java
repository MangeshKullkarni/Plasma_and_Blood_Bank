package com.app.service;

import java.util.List;

import com.app.pojos.Address;
import com.app.pojos.BloodCamp;
import com.app.pojos.BloodRequest;
import com.app.pojos.CampAttendance;
import com.app.pojos.Doner;

public interface IBloodCampService {

	String createNewCamp(Address add, BloodCamp bloodC);

	List<BloodCamp> fetchBloodCamp();

	String removeCamp(int cid);

	List<BloodCamp> listOfUpcommingCamp();

	String addDonerRecored(CampAttendance ca);

	List<CampAttendance> donerHistory(String name);

	int attendedCount(String name);

	int upcommingCount();

	List<BloodRequest> fetchBloodRequest();

	String deleteBloodRequest(int rid);

	BloodRequest fetchRequestById(int rid);

	List<BloodRequest> fetctMyrequests(String string);

	
}
