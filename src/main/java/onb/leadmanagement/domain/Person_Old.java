package onb.leadmanagement.domain;

import static org.apache.commons.lang.Validate.*;
import static org.apache.commons.lang.StringUtils.*;

import javax.persistence.*;
@Entity
public class Person_Old {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="personId")
	private Long id;
	
	@Column(nullable=false)
	private String firstName;
	
	private String middleInitial;
	
	@Column(nullable=false)
	private String lastName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contactId")
	private Contact contact;
	
	protected Person_Old(){
		//for jpa
	}
	
	public Person_Old(String firstName, String middleInitial, String lastName,
			Contact contact) {
		
		notEmpty(firstName);
		notNull(middleInitial);
		notEmpty(lastName);
		notNull(contact);
		if(!(isAlpha(firstName) || isAlpha(middleInitial) || isAlpha(lastName))){
			throw new 
				IllegalArgumentException("Name cannot contain non-alphabetic characters");
		}
		
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.contact = contact;
	}
	
	public String getId(){
		return id.toString();
	}
	
	@Override
	public String toString(){
		if(isNotBlank(middleInitial)){
			return firstName+" "+middleInitial+". "+lastName;
		}
		return firstName + " " + lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Person_Old other = (Person_Old) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
