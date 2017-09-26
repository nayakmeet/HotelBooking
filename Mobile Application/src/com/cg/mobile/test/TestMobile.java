package com.cg.mobile.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import oracle.net.aso.s;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationException;
public class TestMobile
{
	static IMobileDAO  dao=null;
	static PurchaseDetails bean=null;

	@BeforeClass
	public static void initialize()
	{
		System.out.println("Hi");
		dao=new MobileDaoImpl();
		bean=new PurchaseDetails();
	}

	@Test
	public void test() {
		bean.setcName("123jon");
		bean.setMailid("abc@gmail.com");
		bean.setMobileId(1001);
		bean.setPhoneId(123);
		bean.setPurchaseId(10);

	}
	
	@Test 
	public void getAdDetails()
		throws MobileApplicationException {
		
		assertNotNull(dao.addPurchaseDetails(bean));
	}
	@Test
	public void getDetails() throws IOException, SQLException
	{
		assertNotNull(dao.retrieveDetails());
	}
}
