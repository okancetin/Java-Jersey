package com.borba.baas.entitymanager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	public static EntityManagerFactory getEntityManagerFactory() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("evento-ds");
		return emf;
	}
}