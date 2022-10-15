package com.av.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Mobile;
import com.av.dto.Sim;


public class TestSaveSimAndMobile 
{
	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		m.setBrand("VIVO");
		m.setName("Y17");
		
		
		Sim sim1=new Sim();
		sim1.setServiceProvider("Aircel");
		sim1.setType("2G");
		sim1.setM(m);
		
		Sim sim2=new Sim();
		sim2.setServiceProvider("Idea");
		sim2.setType("3G");
		sim2.setM(m);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(sim1);
		em.persist(sim2);
		em.persist(m);
		et.commit();
	}
}
