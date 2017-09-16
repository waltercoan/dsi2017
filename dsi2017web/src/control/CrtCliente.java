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
	
	private Cliente model = new Cliente();
	public Cliente getModel() {
		return model;
	}
	public void setModel(Cliente model) {
		this.model = model;
	}
	public void insert(){
		model = new Cliente();
	}
	public void save(){
		clienteEJB.save(model);
	}
	
	

	public List<Cliente> todosClientes(){
		return clienteEJB.todosClientes();
	}
	
	
	
}
