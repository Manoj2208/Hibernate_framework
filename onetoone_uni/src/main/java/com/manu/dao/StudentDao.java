package com.manu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.manu.dto.Laptop;
import com.manu.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manu");
	
	public void saveStudent(Student s,Laptop l){
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(s);
	entityManager.persist(l);
	entityTransaction.commit();
	System.out.println("added");
	
	}
	
	public void getAllDetails(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=(Query) entityManager.createQuery("select s from Student s");
		List<Student> l=query.getResultList();
		for(Student s:l){
			System.out.println("-------------------------------------");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getA().getId());
			System.out.println(s.getA().getBrand());
			System.out.println("-------------------------------------");
			
		}
		
	}
	

}
