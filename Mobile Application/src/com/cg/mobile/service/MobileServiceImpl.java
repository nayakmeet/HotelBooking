package com.cg.mobile.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileServiceImpl implements IMobileService{
	
	
	IMobileDAO dao=new MobileDaoImpl();
	
	@Override
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException {
		
		dao= new MobileDaoImpl();
		return dao.addPurchaseDetails(p);
	
	}

	public boolean validateName(String name)
	{
		String ptn="[A-Z]{1}[A-Za-z]{2,19}";
		if(Pattern.matches(ptn, name))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter valid name");
			return false;
		}
		
	}
		public boolean validatePhoneNo(String phone)
		{
			String phonePattern="[0-9]{10}";
					
			
			if(Pattern.matches(phonePattern,phone))
			{
				return true;
			}
			else
			{
				System.out.println("Please enter valid Phone number.");
				return false;
			}
		}
		
			public boolean validateEmail(String email)
			{
				String emailPattern=
						"^[?=.*A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,6}$";
				
				if(Pattern.matches(emailPattern,email))
				{
					return true;
				}
				else
				{
					System.out.println("Please enter valid Email-id");
					return false;
				}
				
			}	
				public boolean validateMobile(String mobile)
				{
				String mobilePattern="[100]{3}[0-9]{1}";
				
				if(Pattern.matches(mobilePattern,mobile))
				{
					return true;
				}
				else
				{
					System.out.println("Please enter valid Mobile number.");
					return false;
				}
			}

			
				public ArrayList<MobileDetails> retrieveDetails() throws IOException, SQLException {
				
					
					return dao.retrieveDetails();
				
				}

				
				
				

		
}
