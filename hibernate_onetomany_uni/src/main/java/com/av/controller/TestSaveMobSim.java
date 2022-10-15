package com.av.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Phone;
import com.av.dto.Sim;

public class TestSaveMobSim {
	public static void main(String[] args) {
		Sim s1 = new Sim();
		s1.setSp("JIO");
		s1.setType("4gb");

		Sim s2 = new Sim();
		s2.setSp("Airtel");
		s2.setType("3gb");

		List<Sim> list = new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);

		Phone phone = new Phone();
		phone.setName("POCO");
		phone.setBrand("MI");

		phone.setList(list);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(phone);
		et.commit();

	}
}
