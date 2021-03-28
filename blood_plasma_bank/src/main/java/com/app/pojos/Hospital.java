package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hospital_tbl")
public class Hospital extends BaseEntity {
	
	@Column(name = "name",length = 100)
	private String name;
	@Column(name = "mobile_no",length = 13)
	private String mobileNo;
	@Column(name =  "email",length = 30)
	private String email;
	@Column(name = "registration_id",length = 30,unique = true)
	private String registrationId;
	@Column(name = "registration_date")
	private LocalDate registrationDate;
	@Column(name = "password",length = 30)
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hospital_address_id")
	private Address address;
	
	
	public Hospital() {
		super();
	}


	public Hospital(String name, String mobileNo, String email, String registrationId, LocalDate registrationDate,
			String password) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.registrationId = registrationId;
		this.registrationDate = registrationDate;
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRegistrationId() {
		return registrationId;
	}


	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}


	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Hospital [name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + ", registrationId="
				+ registrationId + ", registrationDate=" + registrationDate + ", password=" + password + "]";
	}
	
	
}

