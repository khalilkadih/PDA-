package com.java.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="activité") 
public class Exercices {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
	private String annee;
	private String date_debut;
	private String date_fin;
	
	public Exercices(String annee, String date_debut, String date_fin) {
		super();
		this.annee = annee;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	
	public Exercices() {
		super();
	}

	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}
	
}
