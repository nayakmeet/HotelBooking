package com.cg.donor.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.donor.DTO.DonorBean;

public interface IDonorDAO {

	 public int addDonorDetails(DonorBean db) throws IOException;

	public ArrayList<DonorBean> addDonorDetails() throws IOException, SQLException;

}
