package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stocks_table")
public class Stocks extends BaseEntity {

	@Column(name = "type",length = 30)
	private String type;
	@Column(name = "blood_group")
	private String group;
	@Column(name = "available_quantity") 
	private int availableQuantity;
	public Stocks() {
		super();
	}
	public Stocks(String type, String group, int availableQuantity) {
		super();
		this.type = type;
		this.group = group;
		this.availableQuantity = availableQuantity;
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
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	@Override
	public String toString() {
		return "Stocks [type=" + type + ", group=" + group + ", availableQuantity=" + availableQuantity + "]";
	}
	
	
	
}
