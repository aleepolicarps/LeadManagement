package onb.leadmanagement.jpa;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("GenerateSchemaTests-context.xml")
public class TestData extends AbstractRepositoryTest{
	@Test
	public void testFindByName(){
		String name = "Bank XXX";
		SalesLeadProfile lead = leadRepository.findByName(name);
		assertEquals(name, lead.getName());
	}
	@Test
	public void testFindByIndustry(){
		int size = 3;
		List<SalesLeadProfile> leads = (List<SalesLeadProfile>) 
				leadRepository.findByIndustry(Industry.BANKING_AND_FINANCE);
		assertEquals(size, leads.size());
		assertTrue(leads.contains(leadRepository.findByName("bank xxx")));
	}

}
