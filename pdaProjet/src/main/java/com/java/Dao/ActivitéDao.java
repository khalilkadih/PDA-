package com.java.Dao;

import com.java.Entitys.Activité;
import com.java.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ActivitéDao {
     
	  public void insertEntity(Activité activité){ 
	    	JpaUtil jpautil = new JpaUtil(); 
	        EntityManager entityManager =jpautil.getEntityManagerFactory().createEntityManager(); 
	        EntityTransaction entityTransaction = entityManager.getTransaction();
	        entityTransaction.begin(); 
	        entityManager.persist(activité); 
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    } 

	    public void findEntity(long id) {
	    	JpaUtil jpautil = new JpaUtil(); 
	        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();
	        Activité Activité = entityManager.find(Activité.class, id); 
	        System.out.println("Activité id :: " + Activité.getId()); 
	        System.out.println("Activité getDate_debut :: " +Activité.getDate_debut());
	        System.out.println("Activité getDate_defin :: " + Activité.getDate_defin());
	        System.out.println("Activité Description :: " + Activité.getDescription());  
	        System.out.println("Activité titre :: " + Activité.getTitre());  
	        entityManager.getTransaction().commit();   
	        entityManager.close();
	    }
	    
	   

	    public void updateEntity(long id) {
	    	JpaUtil jpautil = new JpaUtil();
	    	
	        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();

	        Activité Activité = entityManager.find(Activité.class, id);  
	        System.out.println("Activité id :: " + Activité.getId()); 
	        System.out.println("Activité getDate_debut :: " +Activité.getDate_debut());
	        System.out.println("Activité getDate_defin :: " + Activité.getDate_defin());
	        System.out.println("Activité Description :: " + Activité.getDescription());  
	        System.out.println("Activité titre :: " + Activité.getTitre()); 
	        entityManager.merge(Activité);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void removeEntity(long id) {   
	    	JpaUtil jpautil = new JpaUtil();
	    
	        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin(); 
	        Activité Activité = entityManager.find(Activité.class, id); 
	        System.out.println("Activité id :: " + Activité.getId()); 
	        System.out.println("Activité getDate_debut :: " +Activité.getDate_debut());
	        System.out.println("Activité getDate_defin :: " + Activité.getDate_defin());
	        System.out.println("Activité Description :: " + Activité.getDescription());  
	        System.out.println("Activité titre :: " + Activité.getTitre()); 
	        entityManager.remove(Activité);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }
	    
}
