package org.api.mis.mis_api.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.api.mis.mis_api.database.DBConnection;
import org.api.mis.mis_api.model.JobGroup;
import org.api.mis.mis_api.model.University;

public class UniversityService {
	public List<University> getUniversity() throws SQLException {
		List<University> ulist = new ArrayList<>();
		DBConnection.getConnection();
		ResultSet rs = DBConnection.queryData("select university_name, country_name from university, country where university.country_id = country.country_id");
		while (rs.next()) {
			University university = new University(rs.getString("university_name"), rs.getString("country_name"));
			ulist.add(university);
		}

		return ulist;
	}
}
