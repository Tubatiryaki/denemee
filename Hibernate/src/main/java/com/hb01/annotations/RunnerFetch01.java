package com.hb01.annotations;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {
		
		
		Student01 student1=new Student01();
		Student01 student2=new Student01();
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		//
		 Transaction tx=session.beginTransaction();
		 //Fetch işlemi için 1.Method
		 //student1=session.get(Student01.class,1001);
		 //student2=session.get(Student01.class,1002);
		 //System.out.println("----"+student1.getName()+"------");
		 //System.out.println(student1);
		 
		 //Fetch işlemi için 2. Method
		 //Native Query ile select işlemi
	/*	 String sqlQuery1="SELECT * FROM student01";
		 //Listenin her bir elemanı bir kayıttır. Her kayıt kolonlardan oluştuğu için 
		 //Object Array içindeki her bir element bir kolon bilgisi tutar.
		 List<Object []> resultList1 = session.createSQLQuery(sqlQuery1).getResultList();
		 
		 for (Object[] r : resultList1) {
			System.out.println(Arrays.toString(r));
			 //System.out.println("----------");
			 //System.out.println(r[2]);
		}*/
		
		 
		//Fetch işlemi için 3.Method----> HQL(Hibernate Query Language)
		 //HQL sorgularında FROM'dan sonra Entity ismini kullanıyoruz.
		 //Bu örnekte Entity ismi Student01 olduğu için aşağıdaki sorguda bu şekildedir.
		/*
		 * String hqlQuery1="FROM Student01"; List<Student01> resultList2=
		 * session.createQuery(hqlQuery1).getResultList();
		 * 
		 * for (Student01 student : resultList2) { System.out.println(student); }
		 */
		 
		 
		 //ismi John Coffee olan öğrenciyi fetch edelim -->SQL ile
		 
		 String sqlQuery2="SELECT * FROM student01 where name='John Coffee'";
			/*
			 * List<Object []> resultList3=
			 * session.createSQLQuery(sqlQuery2).getResultList();
			 * 
			 * for (Object[] r : resultList3) { System.out.println(Arrays.toString(r)); }
			 */
		 
		
		 //E�er sorgu sonucu tek bir kayıt (unique) döneceğinden eminsek--> SQL ile
			/*
			 * Object[] result1= (Object[])
			 * session.createSQLQuery(sqlQuery2).uniqueResult();
			 * System.out.println(Arrays.toString(result1));
			 */
		 
		 
		 //HQL ile unique result fetch etme alias ile sorgu yazdık
			/*
			 * String hqlQuery2="FROM Student01 s where s.name='John Coffee'"; Object
			 * result2=session.createQuery(hqlQuery2).uniqueResult();
			 * System.out.println(result2);
			 */
		 
		 
		 //HQL ile notu 100 olan öğrencileri getirelim
			/*
			 * String hqlQuery3="FROM Student01 s Where s.grade=100"; List<Object>
			 * resultList4=session.createQuery(hqlQuery3).getResultList();
			 * 
			 * for (Object r : resultList4) { System.out.println(r); }
			 */
		 
		 //HQL ile notu 100 olan öğrencilerin adlarını getirelim
		 String hqlQuery4="SELECT s.name FROM Student01 s Where s.grade=100";
		 List<Object> resultList5=session.createQuery(hqlQuery4).getResultList();
		 
		 for (Object r : resultList5) {
			System.out.println(r);
		}
		 
		 
		 
		 
		 
		 tx.commit();
			
			//Session close önemli yoksa connection açık kalır. 
		 session.close();
		 sf.close();
		

	}

}
