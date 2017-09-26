package com.cg.orb.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;







import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.orb.dto.HotelOwnersDTO;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.RoomException;
import com.cg.orb.service.IRoomRegistrationService;
import com.cg.orb.service.RoomServiceImpl;

public class Client {
	
	static Scanner sc=new Scanner(System.in);
	static int choice=0;
	static RoomRegistrationDTO details=null;

	public static void main(String[] args) throws SQLException, RoomException  {
			
    	IRoomRegistrationService service=new RoomServiceImpl();
		System.out.println("===============");
		System.out.println("1.Booking Room");
		System.out.println("2.Exit");
		System.out.println("===============");
		System.out.println("Enter your choice ");
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1:registerRoom();
		break;
	
		
		
		case 2:System.out.println("Thank You!!! Visit us again...");
			System.exit(0);
			break;
		}}
	 static IRoomRegistrationService service=new RoomServiceImpl();
		
	

	private static void  registerRoom() throws RoomException, SQLException
	{
	
		
		try 
		{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list=service.getAllOwner();
		System.out.println("Existing Owner Id's are:-"+list);
	
		
		System.out.println("Please enter your hotel owner id from above list:- ");
		int hotel_ownid = sc.nextInt();
		if(service.validateHotelId(hotel_ownid, list))
		{
		
		System.out.println("Select  room type: Type (1-1AC, 2-2NON-AC):");
		int rotype =sc.nextInt();
		
		System.out.println("Enter room area in sq. ft.:");
		int  roarea =sc.nextInt();
		
		System.out.println("Enter desired rent amount Rs:");
		int rentamt=sc.nextInt();
		
		System.out.println("Enter desired paid amount Rs:");
		int paidamt=sc.nextInt();
		
		if(service.validate_amt(paidamt,rentamt))
		{
		
	  details= new RoomRegistrationDTO(hotel_ownid, rotype,roarea,rentamt, paidamt);
		
	
	  	
		int res;
		res = service.registerRoom(details);
		System.out.println("Room successfully registered. Room no:"+res);
		}}}
		 catch (IOException e) {
		
			e.printStackTrace();
		} 
		catch (RoomException e) {
			System.out.println("Exception occured in program" +e);
			
		
			//e.printStackTrace();
		}
		
	/*	
		if(res==0)
		{
		
			System.out.println("Value added");
		}
		else
		{
			System.out.println("Value not added");
	
		}
*/
		
	}}


