package onb.leadmanagement.jpa;

import static org.junit.Assert.*;
import onb.leadmanagement.jpainterfaces.SalesLeadJpaRepository;

import org.junit.Test;

public class ServiceTest {

	@Test
	public void testFindByName(){
		SalesLeadJpaRepository service = new SalesLeadJpaImpl();
	}

}
