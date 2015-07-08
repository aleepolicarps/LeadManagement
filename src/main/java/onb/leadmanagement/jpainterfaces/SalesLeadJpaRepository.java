package onb.leadmanagement.jpainterfaces;

import java.util.Collection;

import onb.leadmanagement.domain.ExpenditureType;
import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.dto.SalesLeadDTO;

public interface SalesLeadJpaRepository {
	
	public void createProfile(SalesLeadDTO salesLeadDto);
	
	public SalesLeadProfile findByName(String name);
	
	public Collection<SalesLeadProfile> findByExpenditure(ExpenditureType expenditure);
	
	public Collection<SalesLeadProfile> findByIndustry(Industry industry);
	
}
