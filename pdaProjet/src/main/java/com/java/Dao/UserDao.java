package com.java.Dao;
import com.java.Entitys.User;
import com.java.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UserDao {
    public void insertEntity(User user){ 
    	JpaUtil jpautil = new JpaUtil(); 
        EntityManager entityManager =jpautil.getEntityManagerFactory().createEntityManager(); 
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin(); 
        entityManager.persist(user); 
        entityManager.getTransaction().commit();
        entityManager.close();
    } 

    public void findEntity(long id) {
    	JpaUtil jpautil = new JpaUtil(); 
        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id); 
        System.out.println("user id :: " + user.getId()); 
        System.out.println("User password :: " +user.getPassword());
        System.out.println("User lastname :: " + user.getName());
        System.out.println("User email :: " + user.getEmail());  
        entityManager.getTransaction().commit();   
        entityManager.close();
    }
    
   

    public void updateEntity(long id) {
    	JpaUtil jpautil = new JpaUtil();
    	
        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        User user = entityManager.find(User.class, id);  
        System.out.println("student id :: " + user.getId());
        System.out.println("student firstname :: " + user.getName());
        System.out.println("student email :: " + user.getEmail());
        System.out.println("student password :: " + user.getPassword()); 
        entityManager.merge(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity(long id) {   
    	JpaUtil jpautil = new JpaUtil();
    
        EntityManager entityManager = jpautil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin(); 
        User user = entityManager.find(User.class, id); 
        System.out.println("student id :: " + user.getId()); 
        System.out.println("student name :: " + user.getName());
        System.out.println("student email :: " + user.getEmail());
        System.out.println("student password :: " + user.getPassword()); 
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}