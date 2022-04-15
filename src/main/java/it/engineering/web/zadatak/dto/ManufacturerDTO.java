package it.engineering.web.zadatak.dto;

import java.util.Objects;


public class ManufacturerDTO {
	

	private Long id;
	private String pib;
	private String pid;
	private String address;
	

	private CityDTO city;

	public ManufacturerDTO() {}

	public ManufacturerDTO(String pib, String pid, String address, CityDTO city) {
		this.pib = pib;
		this.pid = pid;
		this.address = address;
		this.city = city;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CityDTO getCity() {
		return city;
	}

	public void setCity(CityDTO city) {
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, city, id, pib, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManufacturerDTO other = (ManufacturerDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(id, other.id) && Objects.equals(pib, other.pib) && Objects.equals(pid, other.pid);
	}

	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", pib=" + pib + ", pid=" + pid + ", address=" + address + ", city=" + city
				+ "]";
	}
	
}
