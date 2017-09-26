package com.cg.enquiry.UI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;




import com.cg.enquiry.DTO.EnquiryBean;
import com.cg.enquiry.SERVICE.EnquiryServiceImpl;
import com.cg.enquiry.SERVICE.IEnquiryService;


public class EnquiryUI {
	
	static int choice=0;	
	static EnquiryBean bean=null;
	static IEnquiryService service=new EnquiryServiceImpl();

	public static void main(String[] args) throws IOException, SQLException 
	
	
	{
		EnquiryUI o = new EnquiryUI();
		o.getOperations();
	}
	Scanner sc=new Scanner(System.in);
		
	void getOperations() throws IOException, SQLException{
	//EnquiryUI o = new EnquiryUI();
		 
	System.out.println("Choose an Operation");
	System.out.println("*********************");
	/*while(true)
	{*/
		
	System.out.println("1.Add Details");
	System.out.println("2.Get Element by ID");
	System.out.println("3.Exit");
	
	System.out.println("Enter your choice ");
	int choice= sc.nextInt();

	switch(choice)
	{
	case 1:getAllDetails();
	break;
	case 2:getByEnquiryId();
	break;
	case 3:System.out.println("Thank You for choosing us.");
		System.exit(0);

	break;
	}	
	}
	private void getAllDetails() throws IOException, SQLException {
		
		
		sc.nextLine();
		
		System.out.println("Enter First Name");
		String fname=sc.nextLine();
		if(service.validateDomain(fname))
		{
			
		
		System.out.println("Enter Last Name");
		String lname=sc.nextLine();
		if(service.validateDomain(lname))
		{
			
		
		System.out.println("Enter Phone Number");
		String phone=sc.nextLine();
		if(service.validateDomain(phone))
		{
			
		
		System.out.println("Enter Domain");
		String domain=sc.nextLine();
		if(service.validateDomain(domain))
		{
		
		System.out.println("Enter Location");
		String locate=sc.nextLine();
		if(service.validateDomain(locate))
		{
		
		IEnquiryService ids=new EnquiryServiceImpl();
	
		bean=new EnquiryBean(fname,lname,phone,domain,locate);
		
		int res=ids.addEnquiryDetails(bean);
		System.out.println(res+"  inserted");
		
		if(res==1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
	
		}
	
		
	}}}}}	}
	IEnquiryService ies=new EnquiryServiceImpl();
	
	private void getByEnquiryId() throws IOException, SQLException
	{
		
	
		System.out.println("Enter the Enquiry Id ");
		int e_id=sc.nextInt();
		ArrayList<EnquiryBean> list = ies.getByEnquiryId(e_id); 
					
		for(EnquiryBean out:list){
			
			
			System.out.println("\nE_Id\tFNAME\tLNAME\tPHONE\tDOMAIN\tLOCATE");
			System.out.println(out);
		
			}
		
		
		
	}

}
