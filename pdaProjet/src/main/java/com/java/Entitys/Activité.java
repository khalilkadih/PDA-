package com.java.Entitys;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity

@Table(name="activité") 

public class Activité {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="titre")
    private String titre;
	@Column(name="description")
	private String description;
	@Column(name="date_debut")
	private String date_debut;
	@Column(name=" date_defin")   
	private String date_defin;
      
	public Activité(String titre, String description, String date_debut, String date_defin) {
		super();
		this.titre = titre;
		this.description = description;
		this.date_debut = date_debut; 
		this.date_defin = date_defin;
	} 
	
	
	public Activité() {
		super();
	}


	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_defin() {
		return date_defin;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setDate_defin(String date_defin) {
		this.date_defin = date_defin;
	}
      
      
}
