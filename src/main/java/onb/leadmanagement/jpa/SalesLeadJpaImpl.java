package onb.leadmanagement.jpa;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import onb.leadmanagement.domain.ExpenditureType;
import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.dto.SalesLeadDTO;
import onb.leadmanagement.jpainterfaces.SalesLeadJpaRepository;


public class SalesLeadJpaImpl implements SalesLeadJpaRepository{

	public SalesLeadJpaImpl(){
	}
	
	@Override
	public void createProfile(SalesLeadDTO salesLeadDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SalesLeadProfile findByName(String name) {
		//Query query = entityManager.createQuery("SELECT p from salesleadprofile p where "
				//+ "p.name= :name");
		//query.setParameter("name",name);
		return null;
	}

	@Override
	public Collection<SalesLeadProfile> findByExpenditure(
			ExpenditureType expenditure) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<SalesLeadProfile> findByIndustry(Industry industry) {
		// TODO Auto-generated method stub
		return null;
	}

}
