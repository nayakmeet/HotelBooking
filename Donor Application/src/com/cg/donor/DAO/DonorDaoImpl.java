package com.cg.donor.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.donor.DTO.DonorBean;
import com.cg.donor.DbUtil.DbUtil;

public class DonorDaoImpl implements IDonorDAO {
	
	Connection conn=null;
	
	public int addDonorDetails(DonorBean db ) throws IOException 
	{
		int res1=0;
	
		try {
			conn=DbUtil.getConnection();
			String insertQuery=
					"Insert into donorDetail values(donorid_seq.nextval,?,?,?,?,SYSDATE)";
			PreparedStatement ps=null;
			ps = conn.prepareStatement(insertQuery);
			ps.setString(1,db.getName());
			ps.setString(2,db.getPhone());
			ps.setString(3,db.getAddr());
			ps.setInt(4, db.getAmount());
			
			
			 res1=ps.executeUpdate();
			System.out.println(res1);
		
			} 
			catch (SQLException e)
		{
		
			e.printStackTrace();
		}
		
		
		
		
			return res1;
		
	}

	@Override
	public ArrayList<DonorBean> addDonorDetails() throws IOException, SQLException {
		
		ArrayList<DonorBean> el = new ArrayList<DonorBean>();
		
		conn = DbUtil.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from donordetail");
		while(rs.next())
		{
			int d_id = rs.getInt(1);
			String d_name = rs.getString(2);
			String phone = rs.getString(3);
			String addr = rs.getString(4);
			int amt = rs.getInt(5);
			String d = rs.getString(6);
			el.add(new DonorBean(d_id,d_name,phone,addr,amt,d));
		}
		
		return el;
		
	
	
	}

}
