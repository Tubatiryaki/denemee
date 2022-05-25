package com.hb04.onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {

		Student04 student1 = new Student04();
		Book04 book1 = new Book04();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Book04.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// Id'si verilen bir öğrencinin kitaplarını get methodu ile aldık.
//		student1=session.get(Student04.class, 1001);
//		for (Book04 book : student1.getBookList()) {
//			System.out.println(book);
//		}

		// id'si verilen bir kitabın öğrencisine erişildi.
//		book1= session.get(Book04.class, 101);
//		System.out.println(book1.getStudent().getName());

		// SQL kullanarak inner join
//		String sqlQuery1="SELECT s.std_name,b.name from student04 s "
//				+ "INNER JOIN book04 b ON s.id=b.student_id";
//		
//		List<Object []> resultList1= session.createSQLQuery(sqlQuery1).getResultList();
//		
//		for (Object[] r : resultList1) {
//			System.out.println(Arrays.toString(r));
//		}

		// HQL kullanarak inner join
//		String hqlQuery1="SELECT s.name,b.name FROM Student04 s "
//				+ "INNER JOIN FETCH Book04 b ON s.id= b.student";
//		
//		List<Object []> resultList2= session.createQuery(hqlQuery1).getResultList();
//		for (Object[] r : resultList2) {
//			System.out.println(Arrays.toString(r));
//		}	
//		for (Object[] r : resultList2) {
//			System.out.println(r[0] +"-"+r[1] );
//		}

//		String hqlQuery2="SELECT s.name,b.name FROM Student04 s "
//		+ "LEFT JOIN FETCH Book04 b ON s.id= b.student";
//
//		List<Object []> resultList3= session.createQuery(hqlQuery2).getResultList();
//		for (Object[] r : resultList3) {
//			System.out.println(Arrays.toString(r));
//		}

//		String hqlQuery3 = "SELECT s.name,b.name FROM Student04 s " + 
//		"RIGHT JOIN FETCH Book04 b ON s.id= b.student";
//
//		List<Object[]> resultList4 = session.createQuery(hqlQuery3).getResultList();
//		for (Object[] r : resultList4) {
//			System.out.println(Arrays.toString(r));
//		}

		//SQL sorgusu ile tüm kayıtları silme
//		String sqlQuery2="DELETE FROM book04";
//		int numOfRec1 = session.createSQLQuery(sqlQuery2).executeUpdate();
//		System.out.println("Effected row count:"+numOfRec1);
		
		//HQL ile tüm kayıtları silme işlemi
//		String hqlQuery4="DELETE FROM Book04";
//		int numOfRec2=session.createQuery(hqlQuery4).executeUpdate();
//		System.out.println("Effected row count:"+numOfRec2);
		
		//Bir kitap adı ile kitap silme HQL Query örneği
//		String hqlQuery5="DELETE FROM Book04 b WHERE b.name='John Coffee'' science book'";
//		int numOfRec3 = session.createQuery(hqlQuery5).executeUpdate();
//		System.out.println("Effected row count: "+numOfRec3);
		
		
		//Student id ile bir kitap silme
//		String hqlQuery6="DELETE FROM Book04 b WHERE b.student=1001";
//		int numOfRec4 = session.createQuery(hqlQuery6).executeUpdate();
//		System.out.println("Effected row count:"+numOfRec4);
		
		//id'si verilen bir oğrenci kaydını  HQL ile silme
		//Eğer Silinmek istenen öğrencinin bir kitabı var ise
		//Yani Book tablosundaki studenti_id kolonunda bu öğrenci id ile ilgili bir kayıt var ise
		//student_id kolonu foreign key olduğu için student silme işlemi yapılamayacaktır.
//		String hqlQuery7="DELETE Student04 s WHERE s.id=1002";
//		int numOfRec5 = session.createQuery(hqlQuery7).executeUpdate();
//		System.out.println("Effected row count:"+numOfRec5);
		
		//Bir id ile get metodu kullanarak Student silme
//		student1= session.get(Student04.class,1002);
//		session.delete(student1);
	
		//delete metodu ile verilen bir id'ye göre bir Book04 silme işlemi
//		book1 = session.get(Book04.class,104);
//		session.delete(book1);
		
	//
//		book1=session.get(Book04.class, 103);
//		session.delete(book1);
//		
		student1=session.get(Student04.class, 1001);
		session.delete(student1);
		
		
		tx.commit();
		
		session.close();
		sf.close();
	}

}
