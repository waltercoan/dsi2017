package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import model.Cliente;
import javax.enterprise.context.RequestScoped;

@Path("/cliente")
@RequestScoped
public class ClienteAPI {

	@GET
	@Produces("application/json")
	public Cliente eunaoacredito(){
		Cliente novocli = new Cliente();
		novocli.setNome("Zezinho");
		return novocli;
	}
	
}



