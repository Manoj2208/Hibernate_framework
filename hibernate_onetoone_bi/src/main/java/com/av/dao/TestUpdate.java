package com.av.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Aadhar;
import com.av.dto.Person;

public class TestUpdate {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=em.find(Person.class, 3);
		if(p!=null){
			p.setName("chethu");
			p.setAge(24);
			Aadhar a=p.getA();
			a.setFatherName("mallikarjunaa");
			a.setNumber(654321);
			p.setA(a);
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("updated successfully");
		}
	}
}
