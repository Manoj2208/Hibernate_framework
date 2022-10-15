package com.av.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Aadhar;
import com.av.dto.Person;

public class TestDelete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Person p = em.find(Person.class, 4);
		if (p != null) {
			Aadhar a = p.getA();
			et.begin();
			em.remove(p);
			em.remove(a);
			System.out.println("deleted person with id "+p.getId()+" and adhar id "+a.getId());
			et.commit();

		}
	}

}
