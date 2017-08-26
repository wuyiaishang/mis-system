package org.api.mis.mis_api.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.mis.mis_api.model.Country;
import org.api.mis.mis_api.service.CountryService;

@Path("/country")
public class CountryResource {

	CountryService cservice = new CountryService();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getCountry() throws SQLException{
		
		return cservice.getCountry();
	}
	
	@GET
	@Path("/{countryId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getText(@PathParam ("countryId") String countryId){
		return countryId;
	}
}
