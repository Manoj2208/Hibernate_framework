package hibernate_onetomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select s from Sim s");
		List<Sim> l = q.getResultList();
		for (Sim s : l) {
			System.out.println("sim id:" + s.getId());
			System.out.println("sim Service provider:" + s.getSp());
			System.out.println("sim type:" + s.getType());
			Phone p = s.getP();
			System.out.println("Phone id:" + p.getId());
			System.out.println("phone brand:" + p.getBrand());
			System.out.println("phone name:" + p.getName());
			System.out.println("-------------------------------------------------");
		}

	}
}
