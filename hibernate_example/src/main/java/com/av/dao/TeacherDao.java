package com.av.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.av.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory e = Persistence.createEntityManagerFactory("manu");
	Scanner sc = new Scanner(System.in);
	public void saveTeacher(Teacher t) {
		EntityManager e1 = e.createEntityManager();
		EntityTransaction e2 = e1.getTransaction();
		e2.begin();
		e1.persist(t);
		System.out.println("teacher added");
		e2.commit();

	}

	public void getTeacherById(int id) {
		EntityManager e1 = e.createEntityManager();
		Teacher t = e1.find(Teacher.class, id);
		if (t != null) {
			System.out.println("Teacher id:" + t.getId());
			System.out.println("Teacher name:" + t.getName());
			System.out.println("Teacher subject:" + t.getSubject());
		}

	}

	public void deleteTeacher(int id) {
		EntityManager e1 = e.createEntityManager();
		EntityTransaction e2 = e1.getTransaction();
		Teacher t = e1.find(Teacher.class, id);
		e2.begin();
		e1.remove(t);
		System.out.println("the teacher " + t.getName() + " removed");
		e2.commit();

	}

	public void updateTeacher(Teacher t) {
		EntityManager e1 = e.createEntityManager();
		EntityTransaction e2 = e1.getTransaction();
		System.out.println("enter name to change");
		String name = sc.next();
		System.out.println("enter subject to change");
		String subject = sc.next();
		t.setName(name);
		t.setSubject(subject);
		e2.begin();
		e1.merge(t);
		e2.commit();

	}
	
	public void getAllTeacher(){
		EntityManager e1 = e.createEntityManager();
		Query query= e1.createQuery("select t from Teacher t");
		List<Teacher> list=query.getResultList();
		for(Teacher t:list){
			System.out.println("teacher id:"+t.getId()+"|teacher name:"+t.getName()+"|teacher subject:"+t.getSubject());
		}
		
	}
	public void getTeacherByName(String name){
		EntityManager e1=e.createEntityManager();
		Query q=e1.createQuery("select t from Teacher t where t.name=?1");
		q.setParameter(1, name);
		List<Teacher> list=q.getResultList();
		for(Teacher t:list){
			System.out.println("teacher id:"+t.getId()+"|teacher name:"+t.getName()+"|teacher subject:"+t.getSubject());
			System.out.println("----------------------------------------------------------------------------------------");
		}

}
	public void getTeacherBySubject(String sub){
		EntityManager e1=e.createEntityManager();
		Query q=e1.createQuery("select t from Teacher t where t.subject=:sub");
		q.setParameter("sub", sub);
		List<Teacher> list=q.getResultList();
		for(Teacher t:list){
			System.out.println("teacher id:"+t.getId()+"|teacher name:"+t.getName()+"|teacher subject:"+t.getSubject());
			System.out.println("----------------------------------------------------------------------------------------");
			
			
		}
		
	}
}
