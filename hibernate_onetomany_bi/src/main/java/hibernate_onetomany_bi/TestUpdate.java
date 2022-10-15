package hibernate_onetomany_bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Phone p = em.find(Phone.class, 2);
		if (p != null) {
			List<Sim> list = p.getList();
			for (Sim s : list) {
				System.out.println("enter sp");
				String sp = sc.next();
				System.out.println("enter type");
				String type = sc.next();
				s.setSp(sp);
				s.setType(type);
			}
			p.setBrand("galaxy");
			p.setName("samsung");
			p.setList(list);
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("updated sucessfully");
		}
		else System.out.println("updation not possible");

	}

}
