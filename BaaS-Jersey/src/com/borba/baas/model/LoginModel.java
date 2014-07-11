/**
 * 
 */
package com.borba.baas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author borba
 *
 */

@Entity
@Table(name = "login")
public class LoginModel {

	/**
	 * @return
	 * 
	 */
	public LoginModel() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "login_id")
	private Long loginId;
	@Column(name = "login_name")
	private String loginNome;
	@Column(name = "login_senha", nullable = true)
	private String loginSenha;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LoginModel) {
			LoginModel loginModel = (LoginModel) obj;
			return loginModel.getLoginId() == this.getLoginId();
		}

		return false;
	}

	/**
	 * @return the loginId
	 */
	public Long getLoginId() {
		return this.loginId;
	}

	/**
	 * @param loginId
	 *            the loginId to set
	 */
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return the loginNome
	 */
	public String getLoginNome() {
		return this.loginNome;
	}

	/**
	 * @param loginNome
	 *            the loginNome to set
	 */
	public void setLoginNome(String loginNome) {
		this.loginNome = loginNome;
	}

	/**
	 * @return the loginSenha
	 */
	public String getLoginSenha() {
		return this.loginSenha;
	}

	/**
	 * @param loginSenha
	 *            the loginSenha to set
	 */
	public void setLoginSenha(String loginSenha) {
		this.loginSenha = loginSenha;
	}

}
