package org.api.mis.mis_api.service;

import java.awt.event.MouseWheelEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.api.mis.mis_api.database.DBConnection;
import org.api.mis.mis_api.model.Country;

public class CountryService {

	public List<Country> getCountry() throws SQLException{
		List<Country> clist = new ArrayList<>();
		DBConnection.getConnection();
		ResultSet rs = DBConnection.queryData("select * from country");
		while (rs.next()) {
			Country country =  new Country(rs.getString("country_id"), rs.getString("country_name"));
			clist.add(country);
		}
		
		return clist;
	} 
}
