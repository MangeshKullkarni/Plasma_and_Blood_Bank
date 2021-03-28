package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "blood_camp_record")
public class CampAttendance extends BaseEntity {

	private String donerName;
	private LocalDate donerDOB;
	@Column(name = "blood_group")
	private String group;
	@Column(name = "fluid_type")
	private String type;
	@Column(name = "bag_count")
	private int quantity;
	@Column(name = "camp_date")
	private LocalDate campDate;
	@Column(name = "donation_time")
	private String time;
	private String mobieNO;
	public CampAttendance() {
		super();
	}
	
	
	public CampAttendance(String donerName, LocalDate donerDOB, String group, String type, int quantity,
			LocalDate campDate, String time, String mobieNO) {
		super();
		this.donerName = donerName;
		this.donerDOB = donerDOB;
		this.group = group;
		this.type = type;
		this.quantity = quantity;
		this.campDate = campDate;
		this.time = time;
		this.mobieNO = mobieNO;
	}


	public LocalDate getDonerDOB() {
		return donerDOB;
	}


	public void setDonerDOB(LocalDate donerDOB) {
		this.donerDOB = donerDOB;
	}


	public String getMobieNO() {
		return mobieNO;
	}

	public void setMobieNO(String mobieNO) {
		this.mobieNO = mobieNO;
	}

	public String getDonerName() {
		return donerName;
	}
	public void setDonerName(String donerName) {
		this.donerName = donerName;
	}
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getCampDate() {
		return campDate;
	}
	public void setCampDate(LocalDate campDate) {
		this.campDate = campDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CampAttendance [donerName=" + donerName + ", donerDOB=" + donerDOB + ", group=" + group + ", type="
				+ type + ", quantity=" + quantity + ", campDate=" + campDate + ", time=" + time + "]";
	}
	
	
	
}
