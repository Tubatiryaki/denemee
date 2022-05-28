package com.hbproject.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory=createSessionFactory();
	
			
	private static SessionFactory createSessionFactory() {
	     
		try {
			SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			return sf;
		}catch(Throwable ex) {
			System.err.println("Session Factory could not be created:"+ex);	
			throw new ExceptionInInitializerError(ex.getMessage());
		}
	}		

	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
