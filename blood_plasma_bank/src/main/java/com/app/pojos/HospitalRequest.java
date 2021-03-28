package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hospitalrequest")
public class HospitalRequest extends BaseEntity {
	
	@Column(name = "blood_plasma", length = 20)
	private String type;
	@Column(name = "blood_group", length = 20)
	private String group;
	@Column(name = "quantity")
	private int quantity;
	
	private LocalDate lastDate;
	@Column(name = "hospital_name")
	private String hospitalName;
	@Column(name = "employeer_name")
	private String employerName;
	@Column(name = "request_date")
	private LocalDate requestDate;
	@Column(name = "request_status")
	private String status;
	@Column(name = "availablity_date")
	private LocalDate avaliblityDate;
	
	private String requesterRemark;
	private String bankRemark;

	public HospitalRequest() {
		super();
	}

	

	public HospitalRequest(String type, String group, int quantity, LocalDate lastDate, String hospitalName,
			String employerName, LocalDate requestDate, String status, LocalDate avaliblityDate, String requesterRemark,
			String bankRemark) {
		super();
		this.type = type;
		this.group = group;
		this.quantity = quantity;
		this.lastDate = lastDate;
		this.hospitalName = hospitalName;
		this.employerName = employerName;
		this.requestDate = requestDate;
		this.status = status;
		this.avaliblityDate = avaliblityDate;
		this.requesterRemark = requesterRemark;
		this.bankRemark = bankRemark;
	}



	public String getRequesterRemark() {
		return requesterRemark;
	}

	public void setRequesterRemark(String requesterRemark) {
		this.requesterRemark = requesterRemark;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDate getLastDate() {
		return lastDate;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public LocalDate getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getAvaliblityDate() {
		return avaliblityDate;
	}

	public void setAvaliblityDate(LocalDate avaliblityDate) {
		this.avaliblityDate = avaliblityDate;
	}

	public String getBankRemark() {
		return bankRemark;
	}

	public void setBankRemark(String bankRemark) {
		this.bankRemark = bankRemark;
	}

	@Override
	public String toString() {
		return "HospitalRequest [type=" + type + ", group=" + group + ", quantity=" + quantity + ", lastDate="
				+ lastDate + ", hospitalName=" + hospitalName + ", employerName=" + employerName + ", requestDate="
				+ requestDate + ", status=" + status + ", avaliblityDate=" + avaliblityDate + ", requesterRemark="
				+ requesterRemark + ", bankRemark=" + bankRemark + "]";
	}

	
}
