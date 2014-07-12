package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.borba.baas.model.LoginModel;

public class LoginJPA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("evento-ds");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();

			LoginModel loginModel = new LoginModel();
			loginModel.setLoginNome("BorbaJPA");
			loginModel.setLoginSenha("Bolinha123");

			em.persist(loginModel);

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