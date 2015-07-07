package onb.leadmanagement.domain;

import static org.apache.commons.lang.Validate.*;

public class Contact {
	private String mobileNumber;
	private String telephoneNumber;
	private String email;
	private Address address;
	
	public Contact(){
		
	}
	
	
	public Contact(String mobileNumber, String telephoneNumber, String email,
			Address address) {
		super();
		this.mobileNumber = mobileNumber;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.address = address;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		notEmpty(mobileNumber);
		this.mobileNumber = mobileNumber;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		notEmpty(telephoneNumber);
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
	
}
