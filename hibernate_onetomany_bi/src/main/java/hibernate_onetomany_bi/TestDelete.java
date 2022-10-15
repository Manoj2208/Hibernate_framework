package hibernate_onetomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Phone p = em.find(Phone.class, 3);
		if (p != null) {
			List<Sim> list = p.getList();
			for (Sim s : list) {
				em.remove(s);

			}
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("deleted sucessfully");
		}

	}

}
