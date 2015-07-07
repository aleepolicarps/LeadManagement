package onb.leadmanagement.domain;

public class CompanyProfile extends LeadProfile {
	private String industry;
	private Person contactPerson;
	
	public CompanyProfile(String name) {
		super(name);
	}
	
	public CompanyProfile(String name, Channel channelAccessed, Contact contact){
		super(name,channelAccessed,contact);
	}
}
