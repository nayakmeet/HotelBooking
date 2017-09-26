package com.cg.donor.UI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.donor.DTO.DonorBean;
import com.cg.donor.Service.DonorServiceImpl;
import com.cg.donor.Service.IDonorService;



public class DonorUI 
{
	static Scanner sc=new Scanner(System.in);
	static int choice=0;	
	IDonorService ids=null;
	static DonorBean bean=null;
	public static void main(String[] args) throws IOException, SQLException 
	{
		
/*
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(10);
		all.add(20);
		System.out.println(all);
		
		for(Integer a : all){
			System.out.println(a+10);
		}
		*/
		
		
		
		
		
		System.out.println("Donor Application");
		System.out.println("*********************");
		while(true)
		{
			
		System.out.println("1.Add Details");
		System.out.println("2.Exit");
		System.out.println("3.All Details");
		
		System.out.println("Enter your choice ");
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1:addDonorDetails();
		break;
		case 2:
			System.exit(0);
			break;
		case 3:
			getAllDetails();
		}}}

	private static void getAllDetails() throws IOException, SQLException {
		
		IDonorService ids=new DonorServiceImpl();
		ArrayList<DonorBean> al = ids.getAllDetails();
		for(DonorBean db : al)
		{
			System.out.println(db);
			
		}
		
		
		
		
	}

	private static void addDonorDetails() throws IOException
	{
		
	
		System.out.println("Enter Donar Namne");
		String name=sc.next();
		
		
		System.out.println("Enter Phone Number");
		String phone=sc.next();
		
		System.out.println("Enter Address");
		String add=sc.next();
		
		System.out.println("Enter Amount");
		int amt=sc.nextInt();
		
		IDonorService ids=new DonorServiceImpl();
		 
  bean=new DonorBean(name,phone,add,amt);
		
		int res=ids.addDonorDetails(bean);
		System.out.println(res+"  inserted");
		
		if(res==1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
	
		}
		
	}
}
