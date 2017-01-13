package ch.bfh.btx8081.w2016.red.healthcaremonitor.persist;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;



public class Connector {

	private static final String PERSISTENCE_UNIT_NAME = "healthcaremonitor";
	private EntityManager em;
			
	private static Connector c = null;
	
	private Connector(){
	}
	
	public static Connector getConnection(){
		if (c == null) {
			c = new Connector();
		}
		return c;
	}
	

	public EntityManager getEM(){
		em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
		return em;
	}
	

	public void close(){
		em.close();
	}
	
	
}
