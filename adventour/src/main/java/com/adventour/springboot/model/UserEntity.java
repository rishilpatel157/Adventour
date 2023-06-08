package com.adventour.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "UserData")
public class UserEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	@Column(name = "customer_Name")
	private String customerName;
	
	@Column(name = "customer_Number")
	private long customerNumber;
	
	@Column(name = "customer_Email")
	private String customerEmail;
	
	@Column(name = "adults_count")
	private int adultsCount;
	
	@Column(name = "child_Count")
	private int childCount;
	
	@Column(name = "tour_Title")
	private String tourTitle;

	public UserEntity() {
		super();
	}

	public UserEntity(long id, String customerName, long customerNumber, String customerEmail, int adultsCount,
			int childCount, String tourTitle) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.customerEmail = customerEmail;
		this.adultsCount = adultsCount;
		this.childCount = childCount;
		this.tourTitle = tourTitle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getAdultsCount() {
		return adultsCount;
	}

	public void setAdultsCount(int adultsCount) {
		this.adultsCount = adultsCount;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public String getTourTitle() {
		return tourTitle;
	}

	public void setTourTitle(String tourTitle) {
		this.tourTitle = tourTitle;
	}

	
	
	
}
