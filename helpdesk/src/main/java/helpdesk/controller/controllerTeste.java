package helpdesk.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("cont")
public class controllerTeste {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String teste(@QueryParam(value = "teste") String teste){
		return "teste";
		 
	}
	

}
