package onb.leadmanagement.domain;

import java.util.*;
import javax.persistence.*;
import static org.apache.commons.lang.Validate.*;


@Entity
public class CompanyLeadProfile extends SalesLeadProfile {
	
	@OneToOne
	@Column(nullable = false)
	@JoinColumn(name="personId")
	private Person contactPerson;
	
	protected CompanyLeadProfile() {
		super();
		//for jpa
	}
	public CompanyLeadProfile(String name, Channel channelAccessed,
			Contact contact, Industry industry, Set<Project> projects,
			Person contactPerson) {
		super(name, channelAccessed, contact, industry, projects);
		notNull(contactPerson);
		this.contactPerson = contactPerson;
	}
	public CompanyLeadProfile(String name) {
		super(name);
		this.contactPerson = null;
	}
	public Person getContactPerson(){
		return contactPerson;
	}
}
