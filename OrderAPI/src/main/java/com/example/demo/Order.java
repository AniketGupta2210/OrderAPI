package com.example.demo;

public class Order {
	private int OrderID;
	private String orderName;
	private String orderDestination;
	private String orderSource;

	public Order(int orderID, String orderName, String orderDestination, String orderSource) {
		super();
		OrderID = orderID;
		this.orderName = orderName;
		this.orderDestination = orderDestination;
		this.orderSource = orderSource;
	}

	@Override
	public String toString() {
		return "Order [OrderID=" + OrderID + ", orderName=" + orderName + ", orderDestination=" + orderDestination
				+ ", orderSource=" + orderSource + "]";
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDestination() {
		return orderDestination;
	}

	public void setOrderDestination(String orderDestination) {
		this.orderDestination = orderDestination;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
