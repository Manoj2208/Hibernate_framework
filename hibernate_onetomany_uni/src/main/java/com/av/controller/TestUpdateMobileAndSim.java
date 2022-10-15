package com.av.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Phone;
import com.av.dto.Sim;

public class TestUpdateMobileAndSim 
{
	public static void main(String[] args) 
	{
		Sim sim1=new Sim();
		sim1.setId(3);
		sim1.setSp("JIO");
		sim1.setType("4G");
		
		Sim sim2=new Sim();
		sim2.setId(4);
		sim2.setSp("BSNL");
		sim2.setType("5G");
		

		List<Sim> s=new ArrayList<Sim>();
		s.add(sim1);
		s.add(sim2);
		Phone m=new Phone();
		m.setId(2);
		m.setBrand("MI");
		m.setName("POKO");
		m.setList(s);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(sim1);
		em.merge(sim2);
		em.merge(m);
		et.commit();
	}
}
