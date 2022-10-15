package com.av.controller;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Phone;

public class TestDeleteMobileAndSim 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Phone m=em.find(Phone.class, 1);
		
		em.remove(m);
		et.commit();
		System.out.println("Phone delelted successfuly");
		
	}
}

	


