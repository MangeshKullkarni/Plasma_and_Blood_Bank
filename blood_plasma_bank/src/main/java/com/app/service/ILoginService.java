package com.app.service;

import com.app.pojos.Admin;
import com.app.pojos.Doner;
import com.app.pojos.Hospital;
import com.app.pojos.Reciver;

public interface ILoginService {

	Admin validateAdmin(String email, String password);

	Hospital validateHospital(String email, String password);

	Doner validateDoner(String email, String password);

	Reciver validateReciver(String email, String password);

}
