package com.hb01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Veritaban�nda bir tablo kar��l��� oldu�unu g�sterir.
//Entity annotation i�ine name ile bir isim verirseniz 
//tablo isminiz ve sorgularda kullanaca��n�z entity ismi bu verilen isim olacakt�r.
//@Entity(name="student01")
@Entity
//Table annotation i�inde name propertyisi olu�acak tablonun ismini belirler.
//@Table(name="tbl_student01")
public class Student01 {

	//@Id annotation alt�ndaki de�i�kenin  primary key yapar.
	//Bu annotasyon her Entity s�n�f�nda olmal�  
	@Id
	private int id;
	
	
	/*
	 * E�er tablodaki kolon ismini de�i�ken isminden farkl� bir isim olarak
	 * olu�turmak istersek @Column(name="student_name") bu �ekilde kullanabiliriz.
	 */
	
	@Column
	private String name;
	
	@Column
	private int grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student01 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
