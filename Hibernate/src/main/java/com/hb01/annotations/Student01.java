package com.hb01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Veritabanında bir tablo karşılığı olduğunu gösterir.
//Entity annotation içine name ile bir isim verirseniz 
//tablo isminiz ve sorgularda kullanacağımız entity ismi bu verilen isim(student01) olacaktır.
//@Entity(name="student01")
@Entity
//Table annotation içinde name propertyisi oluşacak tablonun ismini belirler.
//@Table(name="tbl_student01")
public class Student01 {

	//@Id annotation altındaki değişkeni  primary key yapar.
	//Bu annotasyon her Entity sınıfında olmalı  
	@Id
	private int id;
	
	
	/*
	 * Eğer tablodaki kolon ismini değişken isminden farklı bir isim olarak
	 * oluşturmak istersek @Column(name="student_name") bu şekilde kullanabiliriz.
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
