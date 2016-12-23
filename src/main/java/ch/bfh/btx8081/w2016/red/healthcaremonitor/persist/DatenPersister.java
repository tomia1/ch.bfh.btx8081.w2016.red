package ch.bfh.btx8081.w2016.red.healthcaremonitor.persist;

public class DatenPersister {

	
	private static DatenPersister dp = null;
	
	private DatenPersister(){
		
	}
	

	public static DatenPersister getInstance(){
		if(dp == null) {
			dp = new DatenPersister();
		}
		return dp;
	}
	
	
/**
 * Hier ein beispiel wie man etwas eues hinzufügt. 
 * falls ihr hilfe braucht: call Ludo --> 076/562.20.47
 * --> BSP von einem programierer
	public void addNewPerson(Person p) {
		Connector c = Connector.getConnection();
		
		EntityManager em = c.getEM();
		
		EntityTransaction transaction = em.getTransaction();
	    transaction.begin();
	    
	    try {
		    em.persist(p);
		    em.flush();
		    transaction.commit();
	    } catch (Exception e){
	    	System.out.println("ERROR ON INSERT Person: " + e.getMessage());
	    }
	    em.close();
	}
	
	public void updatePerson(Person p) {
		Connector c = Connector.getConnection();
		
		EntityManager em = c.getEM();
		
		EntityTransaction transaction = em.getTransaction();
	    
	    Person person = em.find(Person.class, p.getId());
	    
	    transaction.begin();
	    person = p;
	    
	    try {
		    em.merge(person); 
		    em.flush();
		    transaction.commit();
	    } catch (Exception e){
	    	System.out.println("ERROR ON UPDATE Person: " + e.getMessage());
	    }
	    em.close();
	}
	**/
}
