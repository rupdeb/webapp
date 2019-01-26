package com.tcd.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/hello")
public class SampleREST {
	@GET
	public Response getMsg() {
 
		
 
		return Response.status(200).entity("You have successfully invoked the REST").build();
 
	}
}
