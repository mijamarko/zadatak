package entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mesto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer pttBroj;
	private String naziv;
	
	public Mesto() {
	}

	public Mesto(Integer pttBroj, String naziv) {
		this.pttBroj = pttBroj;
		this.naziv = naziv;
	}

	public Integer getPttBroj() {
		return pttBroj;
	}

	public void setPttBroj(Integer pttBroj) {
		this.pttBroj = pttBroj;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, pttBroj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesto other = (Mesto) obj;
		return Objects.equals(id, other.id) && Objects.equals(pttBroj, other.pttBroj);
	}

}
