package onb.leadmanagement.jpa;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import onb.leadmanagement.domain.ExpenditureType;
import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.dto.SalesLeadDTO;
import onb.leadmanagement.jpainterfaces.SalesLeadJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class SalesLeadJpaImpl implements SalesLeadJpaRepository{
	
	@Autowired 
	protected ApplicationContext context;
	
	protected EntityManager entityManager;
	
	@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
    	this.entityManager = entityManager;
    }
	
	public SalesLeadJpaImpl(){
	}
	
	@Override
	public void createProfile(SalesLeadDTO salesLeadDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SalesLeadProfile findByName(String name) {
		if(context == null)
			System.out.println("NULL!!!!");
		Query query = entityManager.createQuery("SELECT p from salesleadprofile p where "
				+ "p.name= :name");
		query.setParameter("name",name);
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
