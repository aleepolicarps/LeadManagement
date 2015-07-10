package onb.leadmanagement.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CreateProfileService {
	
	@Autowired
	protected ApplicationContext context;
	
	protected EntityManager entityManager;
	
	@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
    	this.entityManager = entityManager;
    }
	
	public void createProfile(){
		if(context == null)
			System.out.println("SJKLFJSLFJLS");
	}
	
}
