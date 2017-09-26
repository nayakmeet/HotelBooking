package com.cg.mobile.DTO;

import java.time.LocalDate;

public class PurchaseDetails {
	private int purchaseId;
	private String cName;
	private String mailid;
	private long phoneId;
	private LocalDate purchaseDate;
	private int mobileId;
	
	public String toString() {
		return "PurchaseDetails [purchaseId=" + purchaseId + ", cName=" + cName
				+ ", mailid=" + mailid + ", phoneId=" + phoneId
				+ ", purchaseDate=" + purchaseDate + ", mobileId=" + mobileId
				+ "]";
	}
	
	
	public PurchaseDetails(String cName, String mailid, long phone,
			int mobileId) {
		super();
		this.cName = cName;
		this.mailid = mailid;
		this.phoneId = phone;
		this.mobileId = mobileId;
	}


	public PurchaseDetails() {
		
	}


	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
}
	
