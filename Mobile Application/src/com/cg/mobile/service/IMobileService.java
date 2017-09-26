package com.cg.mobile.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;

public interface IMobileService {
				public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException;
				
				public boolean validateName(String name);
				public boolean validatePhoneNo(String phone);
				public boolean validateEmail(String email);
				public boolean validateMobile(String mobile);
				public ArrayList<MobileDetails> retrieveDetails() throws IOException, SQLException;

			
				
}
