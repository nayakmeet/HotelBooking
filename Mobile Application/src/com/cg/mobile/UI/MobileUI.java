package com.cg.mobile.UI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;
import com.cg.mobile.service.IMobileService;
import com.cg.mobile.service.MobileServiceImpl;

public class MobileUI 
	{
	static Scanner sc=new Scanner(System.in);
	static int choice=0;
	static PurchaseDetails details=null;
	static IMobileService service=new MobileServiceImpl();
	
	public static void main(String[] args) throws MobileApplicationException, IOException, SQLException
	{
		Logger logger=Logger.getRootLogger();
		PropertyConfigurator.configure("log4j.properties");
		
		System.out.println("Mobile Application");
		System.out.println("*********************");
		while(true)
		{
			
		System.out.println("1.Enter Purchase Details");
		System.out.println("2.Get the Mobile Details");
		System.out.println("3.Exit");
		System.out.println("Enter your choice ");
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1:addPurchasedetails();
		break;
		case 2:getMobileDetails();
		break;
		case 3:
			System.exit(0);
			break;
		}}}


	private static void addPurchasedetails() throws MobileApplicationException 
	{
		Logger logger=Logger.getRootLogger();
		PropertyConfigurator.configure("log4j.properties");
		
		try
		{
		service=new MobileServiceImpl();
		System.out.println("Enter Customer Namne");
		String name=sc.next();
		if(service.validateName(name))
		{
			
		System.out.println("Enter the MailId");
		String mail=sc.next();
		if(service.validateEmail(mail))
		{
			
		System.out.println("Enter Phone Number");
		long phone=sc.nextLong();
		String phone1=String.valueOf(phone);
		if(service.validatePhoneNo(phone1))
		{
		
		System.out.println("Enter the MobileId");
		int mobid=sc.nextInt();	
		String mobile=String.valueOf(mobid);

		if(service.validateMobile(mobile))
		{
		
		
		details=new PurchaseDetails(name,mail,phone,mobid);
		
	
		
		int res=service.addPurchaseDetails(details);
		System.out.println(res+"  inserted");
		
		if(res==1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
	
		}
		}}}}	
	
		
	}
	catch(MobileApplicationException e)
	{
		
		logger.error("Exception Occured"+e.getMessage());

	
		
	}
	}
	private static void getMobileDetails() throws IOException, SQLException 
	{	
		ArrayList<MobileDetails> list=new ArrayList<MobileDetails>();
		list = service.retrieveDetails();
		for(MobileDetails m:list)
		{
			System.out.println(m.getMobileId());
			System.out.println(m.getName());
			System.out.println(m.getPrice());
			System.out.println(m.getQuantity());
		}
	
	}

}
