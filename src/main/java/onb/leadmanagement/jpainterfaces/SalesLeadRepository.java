package onb.leadmanagement.jpainterfaces;

import java.util.Collection;

import onb.leadmanagement.domain.Industry;
import onb.leadmanagement.domain.SalesLeadProfile;

public interface SalesLeadRepository {
	public void insert(SalesLeadProfile salesLead);
	public SalesLeadProfile findByName(String name);
	public Collection<SalesLeadProfile> findByIndustry(Industry industry);
	public void update(SalesLeadProfile salesLead);
}
