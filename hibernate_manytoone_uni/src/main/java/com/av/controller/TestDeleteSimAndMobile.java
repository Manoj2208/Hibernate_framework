package com.av.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Mobile;
import com.av.dto.Sim;

public class TestDeleteSimAndMobile {
	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("manu");
		EntityManager e1 = e.createEntityManager();
		EntityTransaction et = e1.getTransaction();
		et.begin();
		Sim s = e1.find(Sim.class, 5);
		Mobile m=s.getM();
		e1.remove(s);
		e1.remove(m);
		et.commit();
		System.out.println("sim delelted successfuly");
	}
}
