package com.av.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllTeacher {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("select t from Teacher t");
		List<Teacher> list=q.getResultList();
		for(Teacher t:list){
			System.out.println("Teacher id:"+t.getId());
			System.out.println("Teacher name:"+t.getName());
			System.out.println("Teacher salary:"+t.getSalary());
			List<Subject> sub=t.getList();
			for(Subject s:sub){
				System.out.println("subject id:"+s.getId());
				System.out.println("subject name:"+s.getSname());
				System.out.println("subject duration:"+s.getDuration());
				
			}
			System.out.println("------------------------------------------");
			
		}
	}
}
