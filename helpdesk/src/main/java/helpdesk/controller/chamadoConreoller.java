package helpdesk.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import chamados.Chamado;
import chamados.Status;

@Path("controllador")
public class chamadoConreoller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Chamado> lit_chamados() {
        List<Chamado> chamado = new ArrayList<>();
      
        Chamado c1 = new Chamado();

		c1.setAssunto("Assunto 1");
		c1.setMensagem("Mensagem 1");
		c1.setStatus(Status.NOVO);

		Chamado c2 = new Chamado();

		c2.setAssunto("Assunto 2");
		c2.setMensagem("Mensagem 2");
		c2.setStatus(Status.NOVO);

		Chamado c3 = new Chamado();

		c3.setAssunto("Assunto 3");
		c3.setMensagem("Mensagem 3");
		c3.setStatus(Status.NOVO);

		chamado.add(c1);
		chamado.add(c2);
		chamado.add(c3);

		return chamado;

	}
	
	
	@GET
	@Path("{id/}")
	@Produces()
	public Chamado getChamado(@PathParam("id") long id){
		
		Chamado c1 = new Chamado();
		  
		 c1.setId(id);
		 c1.setAssunto("Assunto 1 " + id);
		 c1.setMensagem("Mensagem 1");
		 c1.setStatus(Status.NOVO);
		
		return c1;
		}
	
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("/")
		public Response Create(Chamado chamado){
		
		System.out.println(chamado.toString());
		
		return Response.status(Response.Status.OK).build();
		
		
		}
	
    	@PUT
    	@Consumes(MediaType.APPLICATION_JSON)
    	@Path("/")
        public Response update(Chamado chamado){
		
		System.out.println(chamado.toString());
		
		return Response.status(Response.Status.OK).build();
		
	}
    	@DELETE
    	@Path("{id}")
    	public Response delete(@PathParam("id") long id){
    		System.out.println("Deletando " + id);
    		return Response.status(Response.Status.OK).build();
    		
    	}
	
}
