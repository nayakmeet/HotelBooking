package com.cg.donor.DTO;

import java.time.LocalDate;

public class DonorBean {
	private int donorId; 
	private String name;
	private String phone;
	private String addr ;
	private int amount;
	private String date;
	@Override
	public String toString() {
		return "DonorBean [donorId=" + donorId + ", name=" + name + ", phone="
				+ phone + ", addr=" + addr + ", amount=" + amount + ", date="
				+ date + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public DonorBean(String name, String phone, String addr, int amount) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.amount = amount;
	}
	public DonorBean(int d_id, String d_name, String phone2, String addr2,
			int amt, String d) {
		super();
		this.donorId = d_id;
		this.name = d_name;
		this.phone = phone2;
		this.addr = addr2;
		this.amount = amt;
		this.date = d;
			}
	
}
