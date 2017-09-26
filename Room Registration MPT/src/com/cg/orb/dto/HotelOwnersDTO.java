package com.cg.orb.dto;

public class HotelOwnersDTO {
	
	@Override
	public String toString() {
		return "HotelOwnersDTO [hoid=" + hoid + ", name=" + name + ", phone="
				+ phone + "]";
	}
	
	private int hoid;
	private String name;
	private int phone;
	
	public int getHoid() {
	return hoid;
	}
	public void setHoid(int hoid) {
		this.hoid = hoid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public HotelOwnersDTO() {
		super();
		this.hoid = hoid;
		this.name = name;
		this.phone = phone;
	}
	public HotelOwnersDTO(int hid)
	{
		
	}
	

}
