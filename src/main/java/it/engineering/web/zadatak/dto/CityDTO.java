package it.engineering.web.zadatak.dto;

import java.util.Objects;


public class CityDTO {

	private Long zipCode;
	private String name;
	
	public CityDTO() {}

	public CityDTO(Long zipCode, String name) {
		this.zipCode = zipCode;
		this.name = name;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityDTO other = (CityDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(zipCode, other.zipCode);
	}

	@Override
	public String toString() {
		return zipCode + ", " + name;
	}
	
}
