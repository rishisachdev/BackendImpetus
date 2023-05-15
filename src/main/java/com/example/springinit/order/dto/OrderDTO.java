package com.example.springinit.order.dto;

public class OrderDTO {
	private int sNo;
	private int orderId;
	private String retailerName;
	private int units;
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
		return "OrderDTO [sNo=" + sNo + ", orderId=" + orderId + ", retailerName=" + retailerName + ", units=" + units + ", amount=" + amount + "]";
	}

	public OrderDTO() {
	}

	public OrderDTO(int sNo, int orderId, String retailerName, int units, int amount) {
		this.sNo = sNo;
		this.orderId = orderId;
		this.retailerName = retailerName;
		this.units = units;
		this.amount = amount;
	}
}
