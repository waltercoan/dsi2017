package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class ClienteEJB
 */
@Stateless
public class ClienteEJB implements ClienteEJBLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext(name="dsi2017context")
    private EntityManager em;
	
    public ClienteEJB() {
        // TODO Auto-generated constructor stub
    }

}
