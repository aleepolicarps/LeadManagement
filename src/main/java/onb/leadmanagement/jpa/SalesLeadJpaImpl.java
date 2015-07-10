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

import org.springframework.stereotype.Repository;

import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.dto.SalesLeadDTO;
import onb.leadmanagement.jpainterfaces.SalesLeadJpaRepository;


@Repository
public class SalesLeadJpaImpl implements SalesLeadJpaRepository{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	@PostConstruct
	public void setUp(){
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	
	@PreDestroy
	public void tearDown(){
		entityManager.close();

	}

	@Override
	public void createProfile(SalesLeadDTO salesLeadDto) {
		//TODO define DTO
	}

	@Override
	public SalesLeadProfile findByName(String name) {
		Query query = entityManager.createQuery(
				"SELECT p FROM SalesLeadProfile p where UPPER(p.name) = :name");
		query.setParameter("name", name.toUpperCase());	
		SalesLeadProfile lead = (SalesLeadProfile) query.getSingleResult();
		return lead;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<SalesLeadProfile> findByIndustry(Industry industry) {
		TypedQuery<SalesLeadProfile> query= (TypedQuery<SalesLeadProfile>)
				entityManager.createQuery(
				"SELECT p FROM SalesLeadProfile p where p.industry= :industry").
				setParameter("industry", industry);
		List<SalesLeadProfile> result = query.getResultList();
		return result;
	}

}
