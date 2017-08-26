package org.api.mis.mis_api.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.api.mis.mis_api.database.DBConnection;
import org.api.mis.mis_api.model.Student;
import org.api.mis.mis_api.model.University;

public class StudentService {
	public List<Student> getStudent() throws SQLException {
		List<Student> slist = new ArrayList<>();
		DBConnection.getConnection();
		ResultSet rs = DBConnection.queryData("select stu_fname, stu_lname, stu_gender, semester_name, internship_type from student, semester, internship  where student.semester_id = semester.semester_id and student.internship_id = internship.internship_id");
		while (rs.next()) {
			Student student = new Student(rs.getString("stu_fname"), rs.getString("stu_lname"), rs.getString("stu_gender"), rs.getString("semester_name"), rs.getString("internship_type"));
			slist.add(student);
		}

		return slist;
	}
}
