package api;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import ejb.ClienteEJBLocal;
import model.Cliente;

@Path("/cliente")
@RequestScoped
public class ClienteAPI {
	
	@EJB
	private ClienteEJBLocal clienteEJB;
	
	@GET
	@Produces("application/json")
	public List<Cliente> getClientes(){
		return clienteEJB.todosClientes();
	}
	
}



