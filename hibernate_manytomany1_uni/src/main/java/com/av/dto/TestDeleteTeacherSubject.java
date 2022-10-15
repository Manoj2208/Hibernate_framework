package com.av.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteTeacherSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Teacher t=em.find(Teacher.class, 1);
		if(t!=null){
			et.begin();
			em.remove(t);
			System.out.println("Teacher "+t.getName()+" removed");
			et.commit();
		}
	}

}
