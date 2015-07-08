package onb.leadmanagement.jpa;

import onb.leadmanagement.domain.SalesLeadProfile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class GenerateSchemaTests extends AbstractJpaTests {
	
	@Test
	public void testSchema(){	
		entityManager.getMetamodel().entity(SalesLeadProfile.class);
	}
	

}
