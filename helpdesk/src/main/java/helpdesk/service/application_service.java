package helpdesk.service;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("rest")
public class application_service  extends ResourceConfig {
	public application_service (){
		packages("helpdesk.controller");
		
	}
	

}
