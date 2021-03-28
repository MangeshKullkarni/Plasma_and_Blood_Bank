package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "blood_camp")
public class BloodCamp extends BaseEntity {

	@Column(name = "title")
	private String title;
	@Column(name = "camp_date")
	private LocalDate campDate;
	@Column(name = "purpose")
	private String purpose;
	@Column(name = "organiser_name")
	private String organiser;
	@Column(name = "organiser_mobile")
	private String organiserMobile;
	@Column(name = "start_time")
	private String startTime;
	@Column(name = "end_time")
	private String endTime;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "camp_address_id")
	private Address address;

	public BloodCamp() {
		super();
	}

	
	public BloodCamp(String title, LocalDate campDate, String purpose, String organiser, String organiserMobile,
			String startTime, String endTime) {
		super();
		this.title = title;
		this.campDate = campDate;
		this.purpose = purpose;
		this.organiser = organiser;
		this.organiserMobile = organiserMobile;
		this.startTime = startTime;
		this.endTime = endTime;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getCampDate() {
		return campDate;
	}

	public void setCampDate(LocalDate campDate) {
		this.campDate = campDate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public String getOrganiser() {
		return organiser;
	}


	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}


	public String getOrganiserMobile() {
		return organiserMobile;
	}


	public void setOrganiserMobile(String organiserMobile) {
		this.organiserMobile = organiserMobile;
	}


	@Override
	public String toString() {
		return "BloodCamp [title=" + title + ", campDate=" + campDate + ", purpose=" + purpose + ", organiser="
				+ organiser + ", organiserMobile=" + organiserMobile + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}

	

}
