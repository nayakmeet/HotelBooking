package com.cg.frs.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.HotelOwnersDTO;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.RoomException;

public interface IRoomDAO {



	
	public int registerRoom(RoomRegistrationDTO flat) throws IOException, SQLException, RoomException;

	public ArrayList<Integer> getAllOwner() throws RoomException;






}
