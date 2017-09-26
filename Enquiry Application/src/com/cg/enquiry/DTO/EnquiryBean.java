package com.cg.enquiry.DTO;


public class EnquiryBean {
		private int enquiryId; 
		private String fname;
		private String lname;
		private String phone ;
		private String domain;
		private String locate;
		

		@Override
		public String toString() {
			return "" +enquiryId + "\t" +  fname
					+ "\t" + lname +"\t" + phone + "\t" + domain + "\t" + locate;
		}
		
		public int getEnquiryId() {
			return enquiryId;
		}
		public void setEnquiryId(int enquiryId) {
			this.enquiryId = enquiryId;
		}

		public EnquiryBean(String fname, String lname,
				String phone, String domain, String locate) {
			super();
			this.enquiryId = enquiryId;
			this.fname = fname;
			this.lname = lname;
			this.phone = phone;
			this.domain = domain;
			this.locate = locate;
		}

		public EnquiryBean(){}
		
		
		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getDomain() {
			return domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getLocate() {
			return locate;
		}

		public void setLocate(String locate) {
			this.locate = locate;
		}

		public void getAllDetails() {
		
			
		}

		public void getByEnquiryId() {
		
			
		}

		public void getOperations() {
		
			
		}

	


}
