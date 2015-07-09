package onb.leadmanagement.jpa;
import static org.junit.Assert.fail;
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
		if(entityManager == null)
			fail("NULL!");
		entityManager.getMetamodel().entity(SalesLeadProfile.class);
	}
}	


