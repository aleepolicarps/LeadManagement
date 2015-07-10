package onb.leadmanagement.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

import org.junit.Test;

public class LeadProfileTest {

	@Test
	public void CompanyProfileExample() {	
		Contact contactXxx = new Contact("09051261020","1234567", 
				"bankXxx@gmail.com", new Address("123", "456", 
						"StreetX", "BarangayX", "123", "Manila", "Philippines"));
		
		Person personXxx = new Person("FistnameX", "", "LastnameX", 
				new Contact("1234567891","1234567","personXxx@gmail.com",
						null));
			
		SalesLeadProfile leadXxx = new CompanyLeadProfile(
				"Bank XXX", Channel.LANDLINE_CALL, contactXxx, Industry.BANKING_AND_FINANCE,
				new HashSet<Project>(),new ArrayList<Communication>(), personXxx);
		
		assertEquals(contactXxx.toString(), leadXxx.getContact().toString());
		
		Project consulationProjectXxx = new ConsultationProject("ProjectXxx");
		
		Communication comm1 = new Communication(Calendar.JANUARY, 1, 2015,
				"02:00", 0, null, "Initial contact",
				"tl;dr", Channel.LANDLINE_CALL);
	
		leadXxx.addToLog(comm1);
		assertEquals(1, leadXxx.getCommunicationLog().size());

		leadXxx.addProject(consulationProjectXxx);
		assertEquals(1, leadXxx.getProjects().size());
		
	}

}
