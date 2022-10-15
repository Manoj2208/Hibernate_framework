package com.av.dto;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacherAndSubject {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Teacher t=em.find(Teacher.class, 2);
		if(t!=null){
			t.setName("sudheer");
			t.setSalary(76000);
			List<Subject> l=t.getList();
			for(Subject s:l){
				String name=sc.next();
				s.setSname(name);
				int dur=sc.nextInt();
				s.setDuration(dur);
				
			}
			t.setList(l);
		}
		et.begin();
		em.merge(t);
		et.commit();
		
		
	}

}
