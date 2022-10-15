package com.manu.controller;

import com.manu.dao.StudentDao;

public class GetAllDetails {
	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		dao.getAllDetails();
	}

}
