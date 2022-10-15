package com.av.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 
@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String brand;
	private String name;
	
	@OneToMany
	List<Sim> list;

	public List<Sim> getList() {
		return list;
	}

	public void setList(List<Sim> list) {
		this.list = list;
	}

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
