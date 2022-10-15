package com.av.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.av.dto.Phone;
import com.av.dto.Sim;

public class TestGetPhoneSim {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manu");
		EntityManager emManager = entityManagerFactory.createEntityManager();
		Phone p = emManager.find(Phone.class,1);
		if(p!=null)
		{
			System.out.println("Phone id:"+p.getId());
			System.out.println("Phone sp:"+p.getName());
			System.out.println("Phone type:"+p.getBrand()); 
			List<Sim>list=p.getList();
			for(Sim s:list)
			{
		
			System.out.println("sim id:"+s.getId());
			System.out.println("sim sp:"+s.getSp());
			System.out.println("sim type:"+s.getType());
			}
		}
	}

}
