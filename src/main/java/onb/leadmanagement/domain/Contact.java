package onb.leadmanagement.domain;

import static org.apache.commons.lang.Validate.*;
import static org.apache.commons.lang.StringUtils.*;

import javax.persistence.*;

import org.mockito.internal.matchers.NotNull;

@Entity
public class Contact {
	
	@Id
	@Column(name = "contactId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String mobileNumber;
	private String telephoneNumber;
	private String email;
	
	@Embedded
	private Address address;
	
	public Contact(){
		
	}
	public Contact(String mobileNumber, String telephoneNumber, String email,
			Address address) {	
		notNull(mobileNumber);
		notNull(telephoneNumber);
		notNull(email);
		if(!isNumeric(mobileNumber))
			throw new IllegalArgumentException("Mobile number must only be numeric");
		if(!isNumeric(telephoneNumber))
			throw new IllegalArgumentException("Telephone number must only be numeric");
		
		this.mobileNumber = mobileNumber;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.address = address;
	}

	public String getId(){
		return id.toString();
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		notEmpty(mobileNumber);
		if(!isNumeric(mobileNumber))
			throw new IllegalArgumentException("Mobile number must only be numeric");
		this.mobileNumber = mobileNumber;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		notEmpty(telephoneNumber);
		if(!isNumeric(telephoneNumber))
			throw new IllegalArgumentException("Telephone number must only be numeric");
		this.telephoneNumber = telephoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		notEmpty(email);
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		notNull(address);
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if(isNotEmpty(mobileNumber))
			sb.append("Mobile Number: ").append(mobileNumber).append("\n");
		if(isNotEmpty(telephoneNumber))
			sb.append("Telephone Number: ").append(telephoneNumber).append("\n");
		if(isNotEmpty(email))
			sb.append("Email: ").append(email).append("\n");
		if(address !=  null)
			sb.append("Address: ").append(address);
		
		return sb.toString();
	}
	
}
