package com.manu.controller;

import com.manu.dao.LaptopDao;
import com.manu.dao.StudentDao;
import com.manu.dto.Laptop;
import com.manu.dto.Student;

public class SaveStudLap {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.setBrand("dell");
		
		Student s=new Student();
		s.setName("darshan");
		s.setAge(22);
		
		s.setA(laptop);
		laptop.setS(s);
		
		//LaptopDao ld=new LaptopDao();
		//ld.saveLaptop(laptop);
		
		StudentDao studentDao=new StudentDao();
		studentDao.saveStudent(s,laptop);
		
	}

}
