package onb.leadmanagement.jpa;

import java.util.Collection;

import onb.leadmanagement.domain.ExpenditureType;
import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;
import onb.leadmanagement.dto.SalesLeadDTO;
import onb.leadmanagement.jpainterfaces.SalesLeadJpaRepository;

public class SalesLeadJpaImpl implements SalesLeadJpaRepository {

	@Override
	public void createProfile(SalesLeadDTO salesLeadDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SalesLeadProfile findByName(String name) {
		// TODO Auto-generated method stub
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
