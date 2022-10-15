package com.manu.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manu.dto.Laptop;

public class LaptopDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manu");
	
	public void saveLaptop(Laptop l){
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(l);
	entityTransaction.commit();
	System.out.println("added");
	
	}
	

}
