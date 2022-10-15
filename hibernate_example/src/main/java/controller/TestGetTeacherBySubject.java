package controller;

import com.av.dao.TeacherDao;

public class TestGetTeacherBySubject {
	public static void main(String[] args) {
		TeacherDao t=new TeacherDao();
		t.getTeacherBySubject("java");
	}

}
