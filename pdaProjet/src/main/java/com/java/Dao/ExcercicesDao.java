package com.java.Dao;

import com.java.Entitys.Exercices;
import com.java.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ExcercicesDao {
	  public void insertEntity(Exercices Exercices){ 
	    	JpaUtil jpautil = new JpaUtil(); 
	        EntityManager entityManager =jpautil.getEntityManagerFactory().createEntityManager(); 
	        EntityTransaction entityTransaction = entityManager.getTransaction();
	        entityTransaction.begin(); 
	        entityManager.persist(Exercices); 
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    } 

	    public void findEntity(long id) {
	    	JpaUtil jpautil = new JpaUtil(); 
	        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();
	        Exercices exercices = entityManager.find(Exercices.class, id); 
	        //System.out.println("Exercices id :: " + exercices.getId()); 
	        System.out.println("Exercices Annee :: " +exercices.getAnnee());
	        System.out.println("Exercices Date_debut :: " + exercices.getDate_debut());
	        System.out.println("Exercices date_fin :: " + exercices.getDate_fin());  
	        entityManager.getTransaction().commit();   
	        entityManager.close();
	    }
	    
	   

	    public void updateEntity(long id) {
	    	JpaUtil jpautil = new JpaUtil();
	    	
	        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();

	        Exercices exercices = entityManager.find(Exercices.class, id);  
	        //System.out.println("Exercices id :: " + exercices.getId());  
	        System.out.println("Exercices Annee :: " +exercices.getAnnee());
	        System.out.println("Exercices Date_debut :: " + exercices.getDate_debut());
	        System.out.println("Exercices date_fin :: " + exercices.getDate_fin());   
	        entityManager.merge(exercices);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void removeEntity(long id) {   
	    	JpaUtil jpautil = new JpaUtil();
	    
	        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin(); 
	        Exercices exercices = entityManager.find(Exercices.class, id); 
	        //System.out.println("Exercices id :: " + exercices.getId()); 
	        System.out.println("Exercices Annee :: " +exercices.getAnnee());
	        System.out.println("Exercices Date_debut :: " + exercices.getDate_debut());
	        System.out.println("Exercices date_fin :: " + exercices.getDate_fin());  
	        entityManager.remove(exercices);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }
}
