package it.engineering.web.zadatak.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Manufacturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pib;
	@Column(name = "personal_id")
	private String pid;
	private String address;
	
	@OneToOne
	@JoinColumn(name = "city_id")
	private City city;

	private Manufacturer() {}

	private Manufacturer(String pib, String pid, String address, City city) {
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
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
		Manufacturer other = (Manufacturer) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(id, other.id) && Objects.equals(pib, other.pib) && Objects.equals(pid, other.pid);
	}

	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", pib=" + pib + ", pid=" + pid + ", address=" + address + ", city=" + city
				+ "]";
	}
	
}
