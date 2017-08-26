package org.api.mis.mis_api.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.api.mis.mis_api.database.DBConnection;
import org.api.mis.mis_api.model.Company;
import org.api.mis.mis_api.model.Country;

public class CompanyService {
	public List<Company> getCompany() throws SQLException{
		List<Company> clist = new ArrayList<>();
		DBConnection.getConnection();
		ResultSet rs = DBConnection.queryData("select * from company");
		while (rs.next()) {
			Company company =  new Company(rs.getString("com_id"), rs.getString("com_name"), rs.getString("com_website"));
			clist.add(company);
		}
		
		return clist;
	} 
}
