package com.cg.mobile.dao;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dbutil.DBUtil;
import com.cg.mobile.exception.MobileApplicationException;

	public class MobileDaoImpl implements IMobileDAO
	{
		Connection conn=null;

		Logger logger=Logger.getRootLogger();
		
		public MobileDaoImpl()
		{
			PropertyConfigurator.configure("log4j.properties");
		}

	public int addPurchaseDetails(PurchaseDetails p)
	{
	int result=0;	

	try
	{
		conn=DBUtil.getConnection();
		String insertQuery=
				"Insert into purchasedetails values(purchase.nextval,?,?,SYSDATE,?)";
		PreparedStatement ps=conn.prepareStatement(insertQuery);
		ps.setString(1,p.getcName());
		ps.setString(2,p.getMailid());
		ps.setLong(3,p.getPhoneId());
		String sql="select mobileid from mobiledetails where mobileid=?";
		
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, p.getMobileId());
		
		ResultSet rs= pst.executeQuery();
		while(rs.next())
		{
			ps.setInt(4, rs.getInt(1));
			result=ps.executeUpdate();
			System.out.println(result);
			
			
		}
		
		logger.info("Executed Successfully");

	} 
	catch (IOException e) 
	{
		logger.error("Exception Occured"+e.getMessage());
		e.printStackTrace();
		
	} 
	catch (SQLException e) 
	{
	
		logger.error("Exception Occured"+e.getMessage());
		
		
	}
	
	return result;
	}


	public ArrayList<MobileDetails> retrieveDetails() throws IOException, SQLException {
		
		ArrayList<MobileDetails> list=new ArrayList<MobileDetails>();
		
		try
		{
	
		conn=DBUtil.getConnection();
		String sql="Select * from MobileDetails";
	
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		
		while(rs.next())
		{
				int mid=rs.getInt(1);
				String name=rs.getString(2);
				int price=rs.getInt(3);
				String quantity =rs.getString(4);
				 list.add(new MobileDetails(mid,name,price,quantity));
			}
		}
		catch(SQLException|IOException e)
		{
			logger.error("Exception Occured"+e.getMessage());
			System.out.println(e.getMessage());
		}
			return list;
	}
	}
