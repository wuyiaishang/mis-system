package org.api.mis.mis_api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String fname;
	private String lname;
	private String gender;
	private String semester;
	private String intern_type;

	public Student() {

	}

	public Student(String fname, String lname, String gender, String semester, String intern_type) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.semester = semester;
		this.intern_type = intern_type;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getIntern_type() {
		return intern_type;
	}

	public void setIntern_type(String intern_type) {
		this.intern_type = intern_type;
	}
}
