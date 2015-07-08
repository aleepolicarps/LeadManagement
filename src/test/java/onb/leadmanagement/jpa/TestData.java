package onb.leadmanagement.jpa;
import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.HashSet;

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

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("GenerateSchemaTests-context.xml")
public class TestData extends LeadProfilingTest{

	@Override
	protected void setUpLeads() {
		Contact contactXxx = new Contact("09051261020","1234567", 
				"bankXxx@gmail.com", new Address("123", "456", 
						"StreetX", "BarangayX", "123", "Manila", "Philippines"));		
		entityManager.persist(contactXxx);
		
		Contact contactSample = new Contact("1234567891","1234567","personXxx@gmail.com",
				null);
		entityManager.persist(contactSample);
		Person personXxx = new Person("FistnameX", "", "LastnameX", 
				contactSample);
		entityManager.persist(personXxx);
		SalesLeadProfile leadXxx = new CompanyLeadProfile(
				"Bank XXX", Channel.LANDLINE_CALL, contactXxx, Industry.BANKING_AND_FINANCE,
				new HashSet<Project>(), personXxx);
		entityManager.persist(personXxx);
		Project consulationProjectXxx = new ConsultationProject("ProjectXxx");
		entityManager.persist(consulationProjectXxx);
		Communication comm1 = new Communication(Calendar.JANUARY, 1, 2015,
				"02:00", 0, null, "Initial contact",
				"tl;dr", Channel.LANDLINE_CALL);
		entityManager.persist(comm1);
		consulationProjectXxx.addToLog(comm1);
		leadXxx.addProject(consulationProjectXxx);
	}


	

}
