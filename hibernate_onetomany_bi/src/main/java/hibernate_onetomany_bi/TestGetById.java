package hibernate_onetomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Phone p=em.find(Phone.class, 1);
		if(p!=null){
			System.out.println("Phone id:"+p.getId());
			System.out.println("phone brand:"+p.getBrand());
			System.out.println("phone name:"+p.getName());
			List<Sim> l=p.getList();
			for(Sim s:l){
				System.out.println("sim id:"+s.getId());
				System.out.println("sim Service provider:"+s.getSp());
				System.out.println("sim type:"+s.getType());
			}
		}
	}

}
