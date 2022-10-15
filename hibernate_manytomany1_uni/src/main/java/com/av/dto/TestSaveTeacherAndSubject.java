package com.av.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacherAndSubject {
	public static void main(String[] args) {
		Subject s=new Subject();
		s.setSname("c");
		s.setDuration(1);
		
		Subject s2=new Subject();
		s2.setSname("java");
		s2.setDuration(2);
		
		List<Subject> l=new ArrayList<Subject>();
		l.add(s);
		l.add(s2);
		
		Teacher t=new Teacher();
		t.setName("sharan");
		t.setSalary(55000.65);
		t.setList(l);
		
		Subject s3=new Subject();
		s3.setSname("c++");
		s3.setDuration(3);
		
		List<Subject> l1=new ArrayList<Subject>();
		l1.add(s);
		l1.add(s3);
		
		Teacher t1=new Teacher();
		t1.setName("manjunath");
		t1.setSalary(65000.34);
		t1.setList(l1);
		
		EntityManagerFactory e=Persistence.createEntityManagerFactory("manu");
		EntityManager e1=e.createEntityManager();
		EntityTransaction e2=e1.getTransaction();
		
		e2.begin();
		e1.persist(s);
		e1.persist(s2);
		e1.persist(s3);
		e1.persist(t);
		e1.persist(t1);
		e2.commit();
	}

}
