package com.cg.donor.Service;
//import java.sql.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.donor.DAO.DonorDaoImpl;
import com.cg.donor.DAO.IDonorDAO;
import com.cg.donor.DTO.DonorBean;



public class DonorServiceImpl implements IDonorService 
{

	IDonorDAO dao=new DonorDaoImpl();
	
	public int addDonorDetails(DonorBean db) throws IOException {
		
		dao= new DonorDaoImpl();
		return dao.addDonorDetails(db);
	}

	
	public ArrayList<DonorBean> getAllDetails() throws IOException, SQLException {												// ArrayList<DonorBean>
	IDonorDAO ida=new DonorDaoImpl();
	return ida.addDonorDetails();
		
		
	}

}
