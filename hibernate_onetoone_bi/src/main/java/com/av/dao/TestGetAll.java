package com.av.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.av.dto.Person;

public class TestGetAll {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("select p from Person p");
		List<Person> list=q.getResultList();
		for(Person p:list){
			System.out.println("person id:"+p.getId());
			System.out.println("person name:"+p.getName());
			System.out.println("person age:"+p.getAge());
			System.out.println("Aadhar id:"+p.getA().getId());
			System.out.println("father name:"+p.getA().getFatherName());
			System.out.println("Aadhar number:"+p.getA().getNumber());
			System.out.println("------------------------------------------");
		}
	}
}
