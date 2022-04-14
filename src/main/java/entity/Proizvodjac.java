package entity;

import java.util.Objects;

public class Proizvodjac {
	
	private Long id;
	private Integer pib;
	private Integer maticniBroj;
	private String adresa;
	private Mesto mesto;
	
	public Proizvodjac() {
	}

	public Proizvodjac(Integer pib, Integer maticniBroj, String adresa, Mesto mesto) {
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.adresa = adresa;
		this.mesto = mesto;
	}

	public Integer getPib() {
		return pib;
	}

	public void setPib(Integer pib) {
		this.pib = pib;
	}

	public Integer getMaticniBroj() {
		return maticniBroj;
	}

	public void setMaticniBroj(Integer maticniBroj) {
		this.maticniBroj = maticniBroj;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, maticniBroj, pib);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proizvodjac other = (Proizvodjac) obj;
		return Objects.equals(id, other.id) && Objects.equals(maticniBroj, other.maticniBroj)
				&& Objects.equals(pib, other.pib);
	}
	
	

}
