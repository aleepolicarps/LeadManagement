package onb.leadmanagement.jpa;

import static org.junit.Assert.*;

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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class GenerateSchemaTests {

	@Autowired
	protected ApplicationContext context;

	@PersistenceUnit
	protected EntityManagerFactory entityManagerFactory;
	protected EntityManager entityManager;
	
	@Before
	public void setUp(){
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
	}
	@After
	public void tearDown(){
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	@Test
	public void testSchema(){	
		entityManager.getMetamodel().entity(SalesLeadProfile.class);
	}
	

}
