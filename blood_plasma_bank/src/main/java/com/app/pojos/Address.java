package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address_tbl")
public class Address extends BaseEntity {

	@Column(name = "city",length = 30)
	private String city;
	@Column(name = "state",length = 30)
	private String state;
	@Column(name = "district",length = 30)
	private String district;
	@Column(name = "street",length = 500)
	private String street;
	@Column(name = "pincod",length = 6)
	private int pincode;
	@Column(name = "country",length = 30)
	private String country;
	public Address() {
		super();
	}
	public Address(String city, String state, String district, String street, int pincode, String country) {
		super();
		this.city = city;
		this.state = state;
		this.district = district;
		this.street = street;
		this.pincode = pincode;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", district=" + district + ", street=" + street
				+ ", pincode=" + pincode + ", country=" + country + "]";
	}
	
	
}
