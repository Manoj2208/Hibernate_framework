package controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.av.dao.TeacherDao;
import com.av.dto.Teacher;

public class TestUpdateTeacher {
	public static void main(String[] args) {
		TeacherDao td=new TeacherDao();
		EntityManagerFactory e=Persistence.createEntityManagerFactory("manu");
		EntityManager e1=e.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teacher id for update");
		int id=sc.nextInt();
		
		Teacher t=e1.find(Teacher.class, id);
		td.updateTeacher(t);
		
		
	}

}
