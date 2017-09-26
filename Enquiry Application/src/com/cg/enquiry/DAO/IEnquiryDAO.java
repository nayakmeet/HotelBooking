package com.cg.enquiry.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.enquiry.DTO.EnquiryBean;

public interface IEnquiryDAO {

	public ArrayList<EnquiryBean> getByEnquiryId(int e_id) throws IOException, SQLException;
		
		public ArrayList<EnquiryBean> addEnquiryDetails();
		
		public int addDEnquiryDetails(EnquiryBean eb) throws SQLException, IOException;

}
