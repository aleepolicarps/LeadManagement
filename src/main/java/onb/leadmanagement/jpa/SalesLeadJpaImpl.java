package onb.leadmanagement.jpa;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import onb.leadmanagement.domain.ExpenditureType;
import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.dto.SalesLeadDTO;
import onb.leadmanagement.jpainterfaces.SalesLeadJpaRepository;


@Repository
public class SalesLeadJpaImpl implements SalesLeadJpaRepository{
	
	@Autowired
	ApplicationContext context;
	
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	
	
	EntityManager entityManager;

	@Override
	public void createProfile(SalesLeadDTO salesLeadDto) {
		
	}

	@Override
	public SalesLeadProfile findByName(String name) {
		
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createNativeQuery("SELECT count(*) from contact");

		System.out.println(query.getSingleResult());		
		if(entityManager.isOpen()){
			entityManager.close();
		}
		
		
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
