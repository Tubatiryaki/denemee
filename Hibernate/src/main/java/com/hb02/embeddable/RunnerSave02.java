package com.hb02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class RunnerSave02 {

	public static void main(String[] args) {
		
		Course02 courses=new Course02();
		courses.setElective("M�zik,Resim,Almanca");
		courses.setMandatory("Matematik,Fizik");
		
		Student02 student1=new Student02();
		student1.setId(1001);
		student1.setName("John Coffee");
		student1.setGrade(80);
		student1.setCourses(courses);
		
		
		
		
		Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		//Tabloya insert edece�iz
		session.save(student1);
			
		tx.commit();
		session.close();
		sf.close();
		
		
	}

}
