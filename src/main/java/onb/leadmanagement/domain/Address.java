package onb.leadmanagement.domain;



public class Address {
	private String unitNumber;
	private String buildingNumber;
	private String streetName;
	private String barangay;
	private String postalCode;
	private String city;
	private String country;
	
	
	public Address(){
		
	}
	
	public Address(String unitNumber, String buildingNumber, String streetName,
			String barangay, String postalCode, String city, String country) {		
		this.unitNumber = unitNumber;
		this.buildingNumber = buildingNumber;
		this.streetName = streetName;
		this.barangay = barangay;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return unitNumber + ", "+ buildingNumber + ", " + streetName + ", "
				+ barangay + ", " + postalCode + ", " + city
				+ ", " + country;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((barangay == null) ? 0 : barangay.hashCode());
		result = prime * result
				+ ((buildingNumber == null) ? 0 : buildingNumber.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result
				+ ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result
				+ ((unitNumber == null) ? 0 : unitNumber.hashCode());
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
		Address other = (Address) obj;
		if (barangay == null) {
			if (other.barangay != null)
				return false;
		} else if (!barangay.equals(other.barangay))
			return false;
		if (buildingNumber == null) {
			if (other.buildingNumber != null)
				return false;
		} else if (!buildingNumber.equals(other.buildingNumber))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (unitNumber == null) {
			if (other.unitNumber != null)
				return false;
		} else if (!unitNumber.equals(other.unitNumber))
			return false;
		return true;
	}
	
	
	
}
