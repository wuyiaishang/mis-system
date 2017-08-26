package org.api.mis.mis_api.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.mis.mis_api.model.Country;
import org.api.mis.mis_api.model.JobGroup;
import org.api.mis.mis_api.service.CountryService;
import org.api.mis.mis_api.service.JobGroupService;

@Path("/jobgroup")
public class JobGroupResource {
JobGroupService cservice = new JobGroupService();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<JobGroup> getJobGroup() throws SQLException{
		
		return cservice.getJobGroup();
	}
	
	@GET
	@Path("/{jbId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getText(@PathParam ("jbId") String jbId){
		return jbId;
	}
}
