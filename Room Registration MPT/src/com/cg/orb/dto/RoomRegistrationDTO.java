package com.cg.orb.dto;

public class RoomRegistrationDTO {
	
	private int roomnum; 
	private int hoid;
	private int rotype;
	private int roarea ;
	private int rentamt;
	private int paidamt;
	
	public int getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(int roomnum) {
		this.roomnum = roomnum;
	}
	public int getHoid() {
		return hoid;
	}
	public void setHoid(int hoid) {
		this.hoid = hoid;
	}
	public int getRotype() {
		return rotype;
	}
	public void setRotype(int rotype) {
		this.rotype = rotype;
	}
	public int getRoarea() {
		return roarea;
	}
	public void setRoarea(int roarea) {
		this.roarea = roarea;
	}
	public int getRentamt() {
		return rentamt;
	}
	public void setRentamt(int rentamt) {
		this.rentamt = rentamt;
	}
	public int getPaidamt() {
		return paidamt;
	}
	public void setPaidamt(int paidamt) {
		this.paidamt = paidamt;
	}
	
	
	public RoomRegistrationDTO(int hoid, int rotype, int roarea, int rentamt,
			int paidamt) {
		super();
		this.hoid = hoid;
		this.rotype = rotype;
		this.roarea = roarea;
		this.rentamt = rentamt;
		this.paidamt = paidamt;
	}
	public RoomRegistrationDTO()
	{
		
	}
	@Override
	public String toString() {
		return "RoomRegistrationDTO [roomnum=" + roomnum + ", hoid=" + hoid
				+ ", rotype=" + rotype + ", roarea=" + roarea + ", rentamt="
				+ rentamt + ", paidamt=" + paidamt + "]";
	}
	
	
	
}
