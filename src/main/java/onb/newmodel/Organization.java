package onb.newmodel;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static org.apache.commons.lang.Validate.*;

@Entity
public class Organization {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="organizationId")
	private long id;
	
	@Column(nullable=false,unique=true)
	private String name;
	
	private Industry industry;
	@Embedded
	private Contact contact;
	
	protected Organization(){
		//JPA compliance
	}
	public Organization(String name, Industry industry, Contact contact) {
		notEmpty(name);
		notNull(industry);
		notNull(contact);
		this.name = name;
		this.industry = industry;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public Industry getIndustry() {
		return industry;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		notNull(contact);
		this.contact = contact;
	}
}
