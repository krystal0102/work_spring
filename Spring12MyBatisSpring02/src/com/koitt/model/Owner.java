package com.koitt.model;

import java.util.List;

public class Owner {
	
	private String ownerName;
	private List<Pet> perList;
	
	public Owner() {}
	
	public Owner(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public List<Pet> getPerList() {
		return perList;
	}

	public void setPerList(List<Pet> perList) {
		this.perList = perList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result + ((perList == null) ? 0 : perList.hashCode());
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
		Owner other = (Owner) obj;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		if (perList == null) {
			if (other.perList != null)
				return false;
		} else if (!perList.equals(other.perList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [ownerName=");
		builder.append(ownerName);
		builder.append(", perList=");
		builder.append(perList);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	

}
