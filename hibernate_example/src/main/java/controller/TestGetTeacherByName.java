package controller;

import com.av.dao.TeacherDao;

public class TestGetTeacherByName {
	public static void main(String[] args) {
		TeacherDao t=new TeacherDao();
		t.getTeacherByName("manjunath");
	}

}
