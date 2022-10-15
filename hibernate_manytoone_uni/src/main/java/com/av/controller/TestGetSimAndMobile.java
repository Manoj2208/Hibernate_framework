package com.av.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.av.dto.Sim;

public class TestGetSimAndMobile {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("manu");
		EntityManager e1=e.createEntityManager();
		Sim s=e1.find(Sim.class, 3);
		if(s!=null){
			System.out.println("sim id:"+s.getId());
			System.out.println("sim service provider:"+s.getServiceProvider());
			System.out.println("sim type:"+s.getType());
			System.out.println("mobile id:"+s.getM().getId());
			System.out.println("Mobile brand:"+s.getM().getBrand());
			System.out.println("Mobile name:"+s.getM().getName());
		}
	}

}
