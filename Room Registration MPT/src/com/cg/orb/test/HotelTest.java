package com.cg.orb.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.frs.dao.IRoomDAO;
import com.cg.frs.dao.RoomDaoImpl;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.RoomException;

import oracle.net.aso.s;
	public class HotelTest {

		static IRoomDAO  dao=null;
		static RoomRegistrationDTO bean=null;

	@BeforeClass
		public static void initialize()
		{
			System.out.println("Hi");
			dao=new RoomDaoImpl();
			bean=new RoomRegistrationDTO();
		}

		@Test
		public void test() {
			bean.setHoid(1);
			bean.setRotype(1);
			bean.setRoarea(1);
			bean.setRentamt(1250);
			bean.setPaidamt(10000);

		}
		
		@Test 
		public void registerRoom(){
			
			try {
				try {
					assertNotNull(dao.registerRoom(bean));
				} catch (RoomException e) {
			System.out.println("Error here");
				}
			} catch (IOException e) {
			
				e.printStackTrace();
			
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}


		private void assertNotNull(int registerRoom) {
	
			
		}}
