package controller;

import java.util.Scanner;

import com.av.dao.TeacherDao;

public class TestGetTeacherById {
	public static void main(String[] args) {
		TeacherDao t=new TeacherDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teacher id to view details:");
		int id=sc.nextInt();
		t.getTeacherById(id);
	}

}
