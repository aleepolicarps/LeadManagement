package onb.leadmanagement.domain.model;


import static org.apache.commons.lang.StringUtils.*;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {

	private String mobileNumber;
	private String telephoneNumber;
	private String emailAddress;
	private String address;
	
	protected Contact(){
		//JPA compliance
	}
	
	public Contact(String mobileNumber, String telephoneNumber,
			String emailAddress, String address) {
		this.mobileNumber = mobileNumber;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result
				+ ((telephoneNumber == null) ? 0 : telephoneNumber.hashCode());
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
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (telephoneNumber == null) {
			if (other.telephoneNumber != null)
				return false;
		} else if (!telephoneNumber.equals(other.telephoneNumber))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(isNotBlank(mobileNumber)){
			sb.append("Mobile Number: ").append(mobileNumber).append("\n");
		}
		if(isNotBlank(telephoneNumber)){
			sb.append("Telephone Number: ").append(telephoneNumber).append("\n");
		}
		if(isNotBlank(emailAddress)){
			sb.append("Email Address: ").append(emailAddress).append("\n");
		}
		if(isNotBlank(address)){
			sb.append("Address: ").append(address);
		}
		return sb.toString();
	}
	
}
