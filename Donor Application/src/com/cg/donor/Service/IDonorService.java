package com.cg.donor.Service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.donor.DTO.DonorBean;


public interface IDonorService {
		
	public int addDonorDetails(DonorBean db ) throws IOException;

	public ArrayList<DonorBean> getAllDetails() throws IOException, SQLException;

}
