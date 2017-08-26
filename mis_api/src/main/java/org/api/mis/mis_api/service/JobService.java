package org.api.mis.mis_api.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.api.mis.mis_api.database.DBConnection;
import org.api.mis.mis_api.model.Job;
import org.api.mis.mis_api.model.JobGroup;

public class JobService {
	public List<Job> getJob() throws SQLException {
		List<Job> jlist = new ArrayList<>();
		DBConnection.getConnection();
		ResultSet rs = DBConnection.queryData("select job_id, com_name, country_name, job_group_name, job_position, job_salary, job_status from job, company, address, country, job_group where job.job_group_id = job_group.job_group_id and job.com_id = company.com_id and company.addr_id = address.addr_id and address.country_id = country.country_id");
		while (rs.next()) {
			Job job = new Job(rs.getString("job_id"), rs.getString("com_name"), rs.getString("country_name"), rs.getString("job_group_name"), rs.getString("job_position"), rs.getString("job_salary"), rs.getString("job_status"));
			jlist.add(job);
		}

		return jlist;
	}
}
