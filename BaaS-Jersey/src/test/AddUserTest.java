/**
 * 
 */
package test;

import javax.persistence.EntityManager;

import com.borba.baas.entitymanager.JpaUtil;
import com.borba.baas.model.LoginModel;

/**
 * @author borba
 *
 */
public class AddUserTest {

	/**
	 * 
	 */
	public AddUserTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		try {
			entityManager.getTransaction().begin();

			LoginModel loginModel = new LoginModel();
			loginModel.setLoginNome("BorbaJPA");
			loginModel.setLoginSenha("Bolinha123");

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if (entityManager.isOpen()) {
				entityManager.getTransaction().rollback();
			}
		} finally {
			if (entityManager.isOpen()) {
				entityManager.close();
			}
		}

	}

}
