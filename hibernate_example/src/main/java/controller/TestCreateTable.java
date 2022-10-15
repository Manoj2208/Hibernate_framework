package controller;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestCreateTable{
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manu");
		System.out.println(entityManagerFactory);
	}

}
