package com.cg.orb.service;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.frs.dao.IRoomDAO;
import com.cg.frs.dao.RoomDaoImpl;
import com.cg.orb.dto.HotelOwnersDTO;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.RoomException;

public class RoomServiceImpl implements IRoomRegistrationService {

	IRoomDAO dao=new RoomDaoImpl();

	@Override
	public int registerRoom(RoomRegistrationDTO flat) throws IOException,
			SQLException, RoomException {
		
		return dao.registerRoom(flat);
	}

	@Override
	public ArrayList<Integer>getAllOwner() throws RoomException {
		
		return dao.getAllOwner();
	}

	@Override
	public boolean validateHotelId(int hotel_ownid, ArrayList<Integer> list) {
	/*	boolean flag=false;
		for(Integer out:list)
		{
			if(out==hotel_ownid)
			{
				flag=true;
				break;
			}
		}
	*/
		if(list.contains(hotel_ownid))
		{
			return true;
		}
		else {
		System.out.println("The Hotel Id does not exist.");
		return false;}
	}

	@Override
	public boolean validate_amt(int paidamt, int rentamt) {
		if(paidamt>rentamt)
		{
			return true;
		}
		else
		{
		System.out.println("Rent amount is greater then the Paid amount");
		return false;
	}}
	}



	
	


