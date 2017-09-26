package com.cg.enquiry.SERVICE;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.enquiry.DAO.EnquiryDAOImpl;
import com.cg.enquiry.DAO.IEnquiryDAO;
import com.cg.enquiry.DTO.EnquiryBean;

public class EnquiryServiceImpl implements IEnquiryService {
	
	IEnquiryDAO ida=new EnquiryDAOImpl();
	
public int addEnquiryDetails(EnquiryBean eb) throws IOException, SQLException {
		
		ida= new EnquiryDAOImpl();
		return ida.addDEnquiryDetails(eb);
	}

		public ArrayList<EnquiryBean> getByEnquiryId(int e_id) throws IOException, SQLException{
		
		return ida.getByEnquiryId(e_id);
		
	
	}
	@Override
	public ArrayList<EnquiryBean> getAllDetails() 
		{
		
		return ida.addEnquiryDetails();
		
		}
	
	public boolean validateFname(String fname)
	{
		String ptn="[A-Z]{1}[A-Za-z]{2,10}";
		if(Pattern.matches(ptn, fname))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter valid name");
			return false;
		}
	}
	
		public boolean validateLname(String lname)
		{
			String ptn="[A-Z]{1}[A-Za-z]{2,10}";
			if(Pattern.matches(ptn, lname))
			{
				return true;
			}
			else
			{
				System.out.println("Please enter valid name");
				return false;
			}
		}		
			public boolean validatePhone(String phone)
			{
				String ptn="[789]{1}[0-9]{9}";
				if(Pattern.matches(ptn, phone))
				{
					return true;
				}
				else
				{
					System.out.println("Please enter valid name");
					return false;
				}

			}			
			public boolean validateDomain(String domain) {
			if(domain.isEmpty() ||  domain==null )
			{
				System.out.println("Please enter valid name");
				return false;
				}
				else
				{
					return true;
				}
				
				
			
				
			}
	}