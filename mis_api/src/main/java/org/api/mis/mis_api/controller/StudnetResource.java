package org.api.mis.mis_api.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.mis.mis_api.model.Student;
import org.api.mis.mis_api.model.University;
import org.api.mis.mis_api.service.StudentService;
import org.api.mis.mis_api.service.UniversityService;

@Path("/student")
public class StudnetResource {
	StudentService sservice = new StudentService();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent() throws SQLException {

		return sservice.getStudent();
	}

	@GET
	@Path("/{sId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getText(@PathParam("sId") String sId) {
		return sId;
	}
}
