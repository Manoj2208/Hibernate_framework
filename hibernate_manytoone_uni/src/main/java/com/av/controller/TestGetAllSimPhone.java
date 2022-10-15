package com.av.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.av.dto.Sim;

public class TestGetAllSimPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Sim s");
		List<Sim> list=q.getResultList();
		for(Sim s:list){
			System.out.println("sim id:"+s.getId());
			System.out.println("sim service provider:"+s.getServiceProvider());
			System.out.println("sim type:"+s.getType());
			System.out.println("mobile id:"+s.getM().getId());
			System.out.println("Mobile brand:"+s.getM().getBrand());
			System.out.println("Mobile name:"+s.getM().getName());
			System.out.println("-------------------------------------------------");
		}
		
	}

}
