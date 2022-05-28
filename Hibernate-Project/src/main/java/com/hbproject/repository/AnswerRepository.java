package com.hbproject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hbproject.domain.Answer;
import com.hbproject.util.HibernateUtil;

public class AnswerRepository {
	
	
	public void saveAnswer(Answer answer) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(answer);
		tx.commit();
		session.close();
	}

}
