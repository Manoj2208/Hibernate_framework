package com.av.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Aadhar;
import com.av.dto.Person;

public class TestSavePersonAndAadhar {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=new Person();
		p.setName("chethan");
		p.setAge(24);
		
		Aadhar a=new Aadhar();
		a.setFatherName("Mallikarjun");
		a.setNumber(63246412);
		
		p.setA(a);
		a.setP(p);
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		System.out.println("inserted successfully");
	}

}
