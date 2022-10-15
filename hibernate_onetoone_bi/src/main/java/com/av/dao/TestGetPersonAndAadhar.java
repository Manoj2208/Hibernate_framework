package com.av.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.av.dto.Person;

public class TestGetPersonAndAadhar {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class, 3);
		if(p!=null){
			System.out.println("person id:"+p.getId());
			System.out.println("person name:"+p.getName());
			System.out.println("person age:"+p.getAge());
			System.out.println("Aadhar id:"+p.getA().getId());
			System.out.println("father name:"+p.getA().getFatherName());
			System.out.println("Aadhar number:"+p.getA().getNumber());
		}
	}

}
