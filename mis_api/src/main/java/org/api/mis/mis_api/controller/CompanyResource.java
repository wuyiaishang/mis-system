package org.api.mis.mis_api.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.mis.mis_api.model.Company;
import org.api.mis.mis_api.model.Country;
import org.api.mis.mis_api.service.CompanyService;
import org.api.mis.mis_api.service.CountryService;

@Path("/company")
public class CompanyResource {
	CompanyService cservice = new CompanyService();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Company> getCompany() throws SQLException{
		
		return cservice.getCompany();
	}
	
	@GET
	@Path("/{companyId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getText(@PathParam ("companyId") String countryId){
		return countryId;
	}
}
