package com.av.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Mobile;
import com.av.dto.Sim;

public class TestUpdateSimAndMobile {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("manu");
		EntityManager e1=e.createEntityManager();
		EntityTransaction entityTransaction=e1.getTransaction();
		Sim s=e1.find(Sim.class, 4);
		Mobile m=e1.find(Mobile.class, 2);
		if(s!=null){
			s.setServiceProvider("bsnl");
			s.setType("2g");
			m.setName("mts");
			m.setBrand("dingdong");
			s.setM(m);
			entityTransaction.begin();
			e1.merge(m);
			e1.merge(s);
			entityTransaction.commit();
		}
		
		
	}

}
