package control;

import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.ClienteEJBLocal;
import model.Cliente;
import javax.ejb.EJB;
@ManagedBean(name="crtcliente")
@ViewScoped
public class CrtCliente {
	@EJB
	private ClienteEJBLocal clienteEJB;
	
	public List<Cliente> todosClientes(){
		return clienteEJB.todosClientes();
	}
	
	
	
}
