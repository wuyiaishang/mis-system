package org.api.mis.mis_api.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.mis.mis_api.model.JobGroup;
import org.api.mis.mis_api.model.University;
import org.api.mis.mis_api.service.JobGroupService;
import org.api.mis.mis_api.service.UniversityService;

@Path("/university")
public class UniversityResource {
UniversityService cservice = new UniversityService();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<University> getUniversity() throws SQLException{
		
		return cservice.getUniversity();
	}
	
	@GET
	@Path("/{uId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getText(@PathParam ("uId") String uId){
		return uId;
	}
}
