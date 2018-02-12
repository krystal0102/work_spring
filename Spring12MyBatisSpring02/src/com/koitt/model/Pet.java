package com.koitt.model;

import java.util.Date;

public class Pet {
	
	private Integer petId;
	private String perName;
	private String ownerName;
	private Integer price;
	private Date birthDate;
	
	public Pet() {}

	public Pet(Integer petId, String perName, String ownerName, Integer price, Date birthDate) {
		super();
		this.petId = petId;
		this.perName = perName;
		this.ownerName = ownerName;
		this.price = price;
		this.birthDate = birthDate;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result + ((perName == null) ? 0 : perName.hashCode());
		result = prime * result + ((petId == null) ? 0 : petId.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Pet other = (Pet) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		if (perName == null) {
			if (other.perName != null)
				return false;
		} else if (!perName.equals(other.perName))
			return false;
		if (petId == null) {
			if (other.petId != null)
				return false;
		} else if (!petId.equals(other.petId))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pet [petId=");
		builder.append(petId);
		builder.append(", perName=");
		builder.append(perName);
		builder.append(", ownerName=");
		builder.append(ownerName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
 
}
