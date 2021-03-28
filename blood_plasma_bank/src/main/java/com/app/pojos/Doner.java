package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "donar_tbl")
public class Doner extends BaseEntity{
	@Column(name = "doner_name")
	private String name;
	
	private String email;
	
	private String password;
	
	private String gender;
	
	private LocalDate dateOfBirth;
	@Column(name = "blood_plasma")
	private String fluidType;
	@Column(name = "blood_group")
	private String group;
	private String mobileNo;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doner_address_id")
	private Address address;
	public Doner() {
		super();
	}
	public Doner(String name, String email, String password, String gender, LocalDate dateOfBirth, String fluidType,
			String group, String mobileNo) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.fluidType = fluidType;
		this.group = group;
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFluidType() {
		return fluidType;
	}
	public void setFluidType(String fluidType) {
		this.fluidType = fluidType;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Doner [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", fluidType=" + fluidType + ", group=" + group + ", mobileNo="
				+ mobileNo + "]";
	}
	
	

}
