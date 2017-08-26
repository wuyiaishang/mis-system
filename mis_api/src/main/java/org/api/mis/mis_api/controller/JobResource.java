package org.api.mis.mis_api.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.mis.mis_api.model.Job;
import org.api.mis.mis_api.model.JobGroup;
import org.api.mis.mis_api.service.JobGroupService;
import org.api.mis.mis_api.service.JobService;

@Path("/job")
public class JobResource {
JobService jservice = new JobService();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Job> getJob() throws SQLException{
		
		return jservice.getJob();
	}
	
	@GET
	@Path("/{jId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getText(@PathParam ("jId") String jId){
		return jId;
	}
}
