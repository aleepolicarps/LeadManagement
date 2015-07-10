package onb.leadmanagement.jpa;

import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.jpainterfaces.SalesLeadRepository;

import org.springframework.stereotype.Repository;

@Repository
public class SalesLeadJpaImpl implements SalesLeadRepository{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	@PostConstruct
	private void setUp(){
		if(entityManager == null || !entityManager.isOpen()){
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
		}
	}
	@PreDestroy
	public void tearDown(){
		if(entityManager.isOpen()){
			entityManager.flush();
			entityManager.clear();
			entityManager.getTransaction().commit();
		}
	}



	@Override
	public SalesLeadProfile findByName(String name) {	
		Query query = entityManager.createQuery(
				"SELECT p FROM SalesLeadProfile p where UPPER(p.name) = :name");
		query.setParameter("name", name.toUpperCase());	
		SalesLeadProfile lead = (SalesLeadProfile) query.getSingleResult();
		return lead;
	}
	
	@Override
	public Collection<SalesLeadProfile> findByIndustry(Industry industry) {
		@SuppressWarnings("unchecked")
		TypedQuery<SalesLeadProfile> query= (TypedQuery<SalesLeadProfile>)
				entityManager.createQuery(
				"SELECT p FROM SalesLeadProfile p where p.industry= :industry").
				setParameter("industry", industry);
		List<SalesLeadProfile> result = query.getResultList();
		return result;
	}

	@Override
	public void update(SalesLeadProfile salesLead) {
		//entityManager.merge(salesLead);
		
	}

	@Override
	public void insert(SalesLeadProfile salesLead) {
		// TODO Auto-generated method stub
		
	}

}
