package org.api.mis.mis_api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Job {
	private String id;
	private String company_name;
	private String country;
	private String jobgroup;
	private String jobposition;
	private String job_salary;
	private String job_status;
	
	public Job(){
		
	}
	
	public Job(String id, String company_name, String country, String jobgroup, String jobposition, String job_salary, String job_status){
		this.id = id;
		this.company_name = company_name;
		this.country = country;
		this.jobgroup = jobgroup;
		this.jobposition = jobposition;
		this.job_salary = job_salary;
		this.job_status = job_status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getJobgroup() {
		return jobgroup;
	}

	public void setJobgroup(String jobgroup) {
		this.jobgroup = jobgroup;
	}

	public String getJobposition() {
		return jobposition;
	}

	public void setJobposition(String jobposition) {
		this.jobposition = jobposition;
	}


	public String getJob_salary() {
		return job_salary;
	}

	public void setJob_salary(String job_salary) {
		this.job_salary = job_salary;
	}

	public String getJob_status() {
		return job_status;
	}

	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}

}
