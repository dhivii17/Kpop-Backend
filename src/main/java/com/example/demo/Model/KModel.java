package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Idols")
public class KModel {
	@Id
    private int kid;
	private String kname;
	private String kagency;
	private int year;
	public KModel(int year) {
		super();
		this.year = year;
	}
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public KModel(int kid, String kname, String kagency) {
		super();
		this.kid = kid;
		this.kname = kname;
		this.kagency = kagency;
	}
	
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getKagency() {
		return kagency;
	}
	public void setKagency(String kagency) {
		this.kagency = kagency;
	}
	public KModel() {
	

}
}
