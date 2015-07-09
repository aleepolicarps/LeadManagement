package onb.leadmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import onb.leadmanagement.domain.SalesLeadProfile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.transaction.TransactionConfiguration;

@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@TransactionConfiguration(defaultRollback=true)
public abstract class LeadProfilingTest{

	@Autowired
	protected ApplicationContext context;

	@PersistenceUnit
	protected EntityManagerFactory entityManagerFactory;
	protected EntityManager entityManager;
	
	@Before
	public void setUp(){
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		setUpLeads();
		
	}
	@After
	public void tearDown(){
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	protected abstract void setUpLeads();
	

}
