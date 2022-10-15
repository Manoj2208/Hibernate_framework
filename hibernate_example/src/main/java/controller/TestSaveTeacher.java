package controller;

import java.util.Scanner;

import com.av.dao.TeacherDao;
import com.av.dto.Teacher;

public class TestSaveTeacher {
	public static void main(String[] args) {
		TeacherDao t=new TeacherDao();
		Teacher teacher=new Teacher();
		Scanner sc=new Scanner(System.in);
			System.out.println("enter name");
			String name=sc.next();
			teacher.setName(name);
			System.out.println("enter the subject handled by teacher");
			String subject=sc.next();
			teacher.setSubject(subject);
			t.saveTeacher(teacher);
	}
	}
	
