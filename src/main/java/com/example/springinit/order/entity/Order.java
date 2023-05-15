package com.example.springinit.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="orders")

public class Order {

	
	@Id
	@Column (name="SNo", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sNo;
	@Column (name="OrderID", length = 255)
	private int orderId;
	@Column (name="RetailerName", length = 255)
	private String retailerName;
	@Column (name="Units", length = 255)
	private int units;
	@Column (name="Amount", length = 255)
	private int amount;

	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Order [sNo=" + sNo + ", orderId=" + orderId + ", retailerName=" + retailerName + ", units=" + units
				+ ", amount=" + amount + "]";
	}
	
	public Order() {
	}
	
	public Order(int sNo, int orderId, String retailerName, int units, int amount) {
		super();
		this.sNo = sNo;
		this.orderId = orderId;
		this.retailerName = retailerName;
		this.units = units;
		this.amount = amount;
	}

}
