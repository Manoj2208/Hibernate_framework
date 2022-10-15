package hibernate_onetomany_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePhoneSim {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Sim s=new Sim();
		s.setSp("jio");
		s.setType("4g");
		
		Sim s2=new Sim();
		s2.setSp("hutch");
		s2.setType("3g");
		
		List<Sim> list=new ArrayList<Sim>();
		list.add(s);
		list.add(s2);
		
		Phone p=new Phone();
		p.setName("VIVO");
		p.setBrand("Y17");
		p.setList(list);
		
		s.setP(p);
		s2.setP(p);
		
		et.begin();
		em.persist(s);
		em.persist(s2);
		em.persist(p);
		et.commit();
		System.out.println("inserted successfully");
	}
}
