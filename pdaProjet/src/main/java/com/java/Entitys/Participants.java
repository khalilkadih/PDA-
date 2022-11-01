package com.java.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="participant")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id") 
    private int id; 
	private String domaine;
	private String structure;
	public String getDomaine() {
		return domaine;
	}
	
	public Participants( String domaine, String structure) {
		super();
		this.domaine = domaine;
		this.structure = structure;
		this.id=id;
	}
     
	public Participants() {
		super();
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
