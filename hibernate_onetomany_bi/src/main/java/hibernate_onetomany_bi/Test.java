package hibernate_onetomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Sim s=em.find(Sim.class, 1);
		if(s!=null){
			System.out.println(s.getId());
			System.out.println(s.getSp());
			System.out.println(s.getType());
			System.out.println(s.getP().getId());
			System.out.println(s.getP().getName());
			System.out.println(s.getP().getBrand());
		}
		
}
}
