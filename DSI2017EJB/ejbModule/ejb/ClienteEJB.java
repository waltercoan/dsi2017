package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Cliente;

/**
 * Session Bean implementation class ClienteEJB
 */
@Stateless
public class ClienteEJB implements ClienteEJBLocal {

	@PersistenceContext(name="dsi2017context")
    private EntityManager em;
	
    public ClienteEJB() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public List<Cliente> todosClientes() {
		Query q = 
			em.createNamedQuery("todosclientes");
		return q.getResultList();
	}
	@Override
	public void insert(Cliente cliente) {
		em.persist(cliente);
	}
	@Override
	public Cliente getCliente(long id) {
		return em.find(Cliente.class, id);
	}
	@Override
	public void remove(long id) {
		em.remove(em.find(Cliente.class, id));
	}
	@Override
	public void update(long id, Cliente newcliente) {
		Cliente oldcli = em.find(Cliente.class, id);
		if (newcliente.getNome() != null){
			oldcli.setNome(newcliente.getNome());
		}
		oldcli.setSexo(newcliente.getSexo());
		em.merge(oldcli);
	}
}
