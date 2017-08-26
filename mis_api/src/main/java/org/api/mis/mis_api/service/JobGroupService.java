package org.api.mis.mis_api.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.api.mis.mis_api.database.DBConnection;
import org.api.mis.mis_api.model.Country;
import org.api.mis.mis_api.model.JobGroup;

public class JobGroupService {
	public List<JobGroup> getJobGroup() throws SQLException {
		List<JobGroup> jlist = new ArrayList<>();
		DBConnection.getConnection();
		ResultSet rs = DBConnection.queryData("select * from job_group");
		while (rs.next()) {
			JobGroup jobgroup = new JobGroup(rs.getString("job_group_id"), rs.getString("job_group_name"));
			jlist.add(jobgroup);
		}

		return jlist;
	}
}
