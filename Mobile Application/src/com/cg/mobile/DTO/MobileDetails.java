package com.cg.mobile.DTO;

public class MobileDetails {
	private int mobileId; 
	private String name;
	private int price;
	private String quantity;
	
	//Parameterized constructor
	public MobileDetails(int mobileId, String name, int price, String quantity) {
		super();
		this.mobileId = mobileId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	//Default Constructor
	public MobileDetails()																		
	{
		
	}
}
