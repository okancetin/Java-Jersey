package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.borba.baas.model.LoginModel;

public class LoginTest {
	public static void main(String[] args) {

		Session session = null;
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();

		LoginModel loginModel = new LoginModel();
		loginModel.setLoginNome("Borba");
		loginModel.setLoginSenha("Bolinha123");

		session.save(loginModel);
		session.flush();

		if (session != null) {
			session.close();
		}
	}
}