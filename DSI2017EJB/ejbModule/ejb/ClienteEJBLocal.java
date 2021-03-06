package ejb;

import java.util.List;
import javax.ejb.Local;
import model.Cliente;

@Local
public interface ClienteEJBLocal {
	public List<Cliente> todosClientes();
	public void insert(Cliente cliente);
	public Cliente getCliente(long id);
	public void remove(long id);
	public void update(long id, Cliente cliente);
	public void save(Cliente cliente);
}
