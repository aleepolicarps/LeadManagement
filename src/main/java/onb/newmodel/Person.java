package onb.newmodel;

import javax.persistence.*;

import static org.apache.commons.lang.Validate.*;
import static org.apache.commons.lang.StringUtils.*;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="personId")
	private long id;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	private String middleName;
	private String companyPosition;
	@Embedded
	private Contact contact;
	
	@ManyToOne
	@JoinColumn(name="organizationId")
	private Organization organization;
	
	protected Person(){
		//JPA compliance
	}
	
	public Person(String firstName, String lastName, String middleName,
			String companyPosition, Contact contact, Organization organization) {
		
		notEmpty(firstName);
		notEmpty(middleName);
		notNull(contact);
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.companyPosition = companyPosition;
		this.organization = organization;
		this.contact = contact;
	}
	public String getCompanyPosition() {
		return companyPosition;
	}

	public void setCompanyPosition(String companyPosition) {
		notEmpty(companyPosition);
		this.companyPosition = companyPosition;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		notNull(contact);
		this.contact = contact;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		notNull(organization);
		this.organization = organization;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName).append(" ");
		if(isNotBlank(middleName)){
			sb.append(middleName).append(" ");
		}
		sb.append(lastName);
		return sb.toString();
	}

}
