package onb.leadmanagement.jpa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import onb.leadmanagement.domain.Address;
import onb.leadmanagement.domain.Channel;
import onb.leadmanagement.domain.Communication;
import onb.leadmanagement.domain.CompanyLeadProfile;
import onb.leadmanagement.domain.ConsultationProject;
import onb.leadmanagement.domain.Contact;
import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.Person;
import onb.leadmanagement.domain.Project;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.jpainterfaces.SalesLeadRepository;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.transaction.TransactionConfiguration;

@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
@TransactionConfiguration(defaultRollback=true)
public abstract class AbstractRepositoryTest{

	@Autowired
	protected ApplicationContext context;

	@PersistenceUnit
	protected EntityManagerFactory entityManagerFactory;
	protected EntityManager entityManager;
	
	SalesLeadRepository leadRepository;
	
	@Before
	public void setUp(){
		leadRepository = context.getBean(SalesLeadJpaImpl.class);
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		try{
			setUpLeads();
			entityManager.flush();	
			entityManager.getTransaction().commit();
		}finally{
			entityManager.close();
		}
	}
	
	private void setUpLeads() {
		Contact contactXxx = new Contact("09051261020","1234567", 
				"bankXxx@gmail.com", new Address("123", "456", 
						"StreetX", "BarangayX", "123", "Manila", "Philippines"));
		
		Person personXxx = new Person("FistnameX", "", "LastnameX", 
				new Contact("1234567891","1234567","personXxx@gmail.com",
						null));
		
			
		SalesLeadProfile leadXxx = new CompanyLeadProfile(
				"Bank XXX", Channel.LANDLINE_CALL, contactXxx, Industry.BANKING_AND_FINANCE,
				new HashSet<Project>(),new ArrayList<Communication>(), personXxx);
		
		Communication comm1 = new Communication(Calendar.JANUARY, 1, 2015,
				"02:00", 0, null, "Initial contact",
				"tl;dr", Channel.LANDLINE_CALL);
	
		leadXxx.addToLog(comm1);
		
		Project consulationProjectXxx = new ConsultationProject("ProjectXxx");
		leadXxx.addProject(consulationProjectXxx);	
		entityManager.persist(leadXxx);
		
		SalesLeadProfile leadYyy = new CompanyLeadProfile(
				"Bank YYY", Channel.SMS, contactXxx, Industry.CONSTRUCTION,
				new HashSet<Project>(),new ArrayList<Communication>(), personXxx);
		entityManager.persist(leadYyy);
		
		SalesLeadProfile bank1 = new CompanyLeadProfile(
				"bank1", Channel.FACEBOOK, contactXxx, Industry.BANKING_AND_FINANCE,
				new HashSet<Project>(),new ArrayList<Communication>(), personXxx);
		entityManager.persist(bank1);
		
		SalesLeadProfile bank2 = new CompanyLeadProfile(
				"bank2", Channel.LANDLINE_CALL, contactXxx, Industry.BANKING_AND_FINANCE,
				new HashSet<Project>(),new ArrayList<Communication>(), personXxx);
		entityManager.persist(bank2);
	}
	

}
