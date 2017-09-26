package com.cg.enquiry.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




import com.cg.enquiry.DTO.EnquiryBean;
import com.cg.enquiry.DbUtil.DbUtil;

public class EnquiryDAOImpl implements IEnquiryDAO {
	
	Connection conn=null;


	
	public ArrayList<EnquiryBean> getByEnquiryId(int e_id) throws IOException, SQLException {
			//System.out.println("hi");
		ArrayList<EnquiryBean> list = new ArrayList<EnquiryBean>();
		
			conn = DbUtil.getConnection();
			String str="Select * from EnquiryDetails where e_id =?";
			PreparedStatement pst=conn.prepareStatement(str);
			pst.setInt(1, e_id);
			ResultSet rs = pst.executeQuery();
			EnquiryBean ed=new EnquiryBean();
			while(rs.next())
			{
	
				ed.setEnquiryId(rs.getInt(1));
				ed.setFname(rs.getString(2));
				ed.setLname(rs.getString(3));
				ed.setPhone(rs.getString(4));
				ed.setDomain(rs.getString(5));
				ed.setLocate(rs.getString(6));
				
				list.add(ed);//new EnquiryBean(enquiryId, fname, lname, phone, domain, locate)
			}
			
			return list;
	}



	@Override
	public ArrayList<EnquiryBean> addEnquiryDetails() {
		// TODO Auto-generated method stub
		return null;
	}

			
	@Override
	public int addDEnquiryDetails(EnquiryBean eb) throws SQLException, IOException {
		
		int res1=0;
		
		conn=DbUtil.getConnection();
		String insertQuery="Insert into EnquiryDetails values(enquiryid.nextval,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(insertQuery);
		ps.setString(1,eb.getFname());
		ps.setString(2,eb.getLname());
		ps.setString(3,eb.getPhone());
		ps.setString(4,eb.getDomain());
		ps.setString(5, eb.getLocate());
		
		res1=ps.executeUpdate();
		System.out.println(res1);
		
		
		return res1;
	}
}
