package onb.leadmanagement.domain;

import java.util.*;

import javax.persistence.*;

import static org.apache.commons.lang.Validate.*;


@Entity
public class CompanyLeadProfile extends SalesLeadProfile {
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="personId")
	private Person_Old contactPerson;
	
	protected CompanyLeadProfile() {
		super();
		//for jpa
	}
	public CompanyLeadProfile(String name, Channel channelAccessed,
			Contact contact, Industry industry, Set<Project_Old> projects,
			ArrayList<Communication> communicationLog, Person_Old contactPerson) {
		super(name, channelAccessed, contact, industry, projects, communicationLog);
		notNull(contactPerson);
		this.contactPerson = contactPerson;
	}
	public CompanyLeadProfile(String name) {
		super(name);
		this.contactPerson = null;
	}
	public Person_Old getContactPerson(){
		return contactPerson;
	}
}
