package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.borba.baas.model.LoginModel;

public class LoginFindTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Hello");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();

			LoginModel user = em.find(LoginModel.class, 1);

			System.out.println(user.getLoginNome());

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}

		System.out.println("It is over");
	}
}