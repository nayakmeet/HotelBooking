package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.HotelOwnersDTO;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.RoomException;



public interface IRoomRegistrationService {
	
	//public RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws IOException, SQLException;

//	public ArrayList<Integer> getAllOwner();

	//public void is_Hotelid_Exists(int hotel_ownid) throws SQLException, IOException;

//	public int RoomRegistrationDTO(RoomRegistrationDTO details);
	public int registerRoom(RoomRegistrationDTO flat) throws IOException, SQLException, RoomException;

	public ArrayList<Integer> getAllOwner() throws RoomException;

	public boolean validateHotelId(int hotel_ownid, ArrayList<Integer> list);

	public boolean validate_amt(int paidamt, int rentamt);



	

}
