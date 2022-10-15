package com.av.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.av.dto.Phone;
import com.av.dto.Sim;

public class TestGetAllMobileAndSim
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select m from Phone m");
		List<Phone>list=q.getResultList();
		for(Phone p1:list)
		{
			System.out.println("Phone id:"+p1.getId());
			System.out.println("Phone sp:"+p1.getName());
			System.out.println("Phone type:"+p1.getBrand()); 
			List<Sim>list1=p1.getList();
			for(Sim s:list1)
			{
		
			System.out.println("sim id:"+s.getId());
			System.out.println("sim sp:"+s.getSp());
			System.out.println("sim type:"+s.getType());
			}
		}
	}

}
