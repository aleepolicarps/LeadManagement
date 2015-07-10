package onb.leadmanagement.jpa;

import java.util.Collection;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.dto.SalesLeadDTO;
import onb.leadmanagement.jpainterfaces.SalesLeadJpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public class SalesLeadJpaImpl implements SalesLeadJpaRepository{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	private void setUp(){
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	
	@PreDestroy
	private void tearDown(){
		entityManager.close();

	}

	@Override
	public void createProfile(SalesLeadDTO salesLeadDto) {
		//TODO define DTO
	}

	@Override
	public SalesLeadProfile findByName(String name) {
		
		if(entityManager == null || !entityManager.isOpen()){
			setUp();
		}
		
		Query query = entityManager.createQuery(
				"SELECT p FROM SalesLeadProfile p where UPPER(p.name) = :name");
		query.setParameter("name", name.toUpperCase());	
		SalesLeadProfile lead = (SalesLeadProfile) query.getSingleResult();
		
		if(entityManager.isOpen()){
			entityManager.getTransaction().commit();
			tearDown();
		}
		
		return lead;
	}
	
	@Override
	public Collection<SalesLeadProfile> findByIndustry(Industry industry) {
		
		if(entityManager == null || !entityManager.isOpen()){
			setUp();
		}
		
		@SuppressWarnings("unchecked")
		TypedQuery<SalesLeadProfile> query= (TypedQuery<SalesLeadProfile>)
				entityManager.createQuery(
				"SELECT p FROM SalesLeadProfile p where p.industry= :industry").
				setParameter("industry", industry);
		List<SalesLeadProfile> result = query.getResultList();
		
		if(entityManager.isOpen()){
			entityManager.getTransaction().commit();
			tearDown();
		}
		
		return result;
	}

}
