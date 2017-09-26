package com.cg.frs.dao;

import java.io.IOException;
import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.sql.Statement;
import java.util.ArrayList;





import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.orb.dbutil.DbUtil;
import com.cg.orb.dto.HotelOwnersDTO;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.RoomException;

public class RoomDaoImpl implements IRoomDAO {
	
	Connection conn=null;
	Logger logger=Logger.getRootLogger();
	
	public RoomDaoImpl(){
	PropertyConfigurator.configure("log4j.properties");
	}
	
	

/*	@Override
	public int registerRoom(int hotel_ownid) throws SQLException  {
		int result=0 ;
		
		try {
			conn=DbUtil.getConnection();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		String sql="select hotel_id from Hotel_owners  where hotel_id =?";
		
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, hotel_ownid);
		
		ResultSet rs= pst.executeQuery();
		while(rs.next())
		{
			result=rs.getInt(1);
			
		}
	
		return 0;
	}
*/
	@Override
	public int registerRoom(RoomRegistrationDTO details) throws  RoomException {
		
		
		int res1=0;
		try{
		
		conn=DbUtil.getConnection();
		String insertQuery="Insert into Room_Registration values(room_SEQ.nextval,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(insertQuery);
		ps.setInt(1,details.getHoid());
		ps.setInt(2,details.getRotype());
		ps.setInt(3,details.getRoarea());
		ps.setInt(4,details.getRentamt());
		ps.setInt(5,details.getPaidamt());
		
		res1=ps.executeUpdate();
		
		
		String mint="select room_SEQ.currval from room_registration";
		PreparedStatement pt=conn.prepareStatement(mint);
		ResultSet rs=pt.executeQuery();
		while(rs.next())
		{
			res1=rs.getInt(1);
		}
		
		return res1;
		}
		catch(SQLException | IOException e)
		{
			throw new RoomException(e.getMessage());
		}
	
	}





	@Override
	public ArrayList<Integer> getAllOwner() throws RoomException {
		
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		int ar=0;
		try {
			conn=DbUtil.getConnection();
			String sq="Select hotel_id from hotel_owners";
					PreparedStatement pst= conn.prepareStatement(sq);
					ResultSet rs=pst.executeQuery();
					while(rs.next())
					{
						ar=rs.getInt(1);
						list.add(ar);
					}
					logger.info("Executed Successfully");

					return list;
				
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			logger.error("Error Occured"+e.getMessage());
			throw new RoomException(e.getMessage());
			
			//e.printStackTrace();
		}
	
		return null;
	}



}