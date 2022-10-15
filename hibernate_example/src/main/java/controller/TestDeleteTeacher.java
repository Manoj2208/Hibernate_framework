package controller;

import java.util.Scanner;

import com.av.dao.TeacherDao;

public class TestDeleteTeacher {
	public static void main(String[] args) {
		TeacherDao t=new TeacherDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the teacher id to delete");
		int id=sc.nextInt();
		t.deleteTeacher(id);
		
	}

}
