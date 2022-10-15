package com.av.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetTeacherById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();
		Teacher t=em.find(Teacher.class, 2);
		if(t!=null){
			System.out.println("teacher id:"+t.getId());
			System.out.println("teacher name:"+t.getName());
			System.out.println("teacher salary:"+t.getSalary());
			System.out.println("subjects handled are:");
			List<Subject> l=t.getList();
			for(Subject s:l){
				System.out.println("subject id:"+s.getId());
				System.out.println("subject name:"+s.getSname());
				System.out.println("subject duration:"+s.getDuration());
			}
		}

	}

}
