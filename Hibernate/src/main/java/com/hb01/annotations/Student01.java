package com.hb01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Veritabanýnda bir tablo karþýlýðý olduðunu gösterir.
//Entity annotation içine name ile bir isim verirseniz 
//tablo isminiz ve sorgularda kullanacaðýnýz entity ismi bu verilen isim olacaktýr.
//@Entity(name="student01")
@Entity
//Table annotation içinde name propertyisi oluþacak tablonun ismini belirler.
//@Table(name="tbl_student01")
public class Student01 {

	//@Id annotation altýndaki deðiþkenin  primary key yapar.
	//Bu annotasyon her Entity sýnýfýnda olmalý  
	@Id
	private int id;
	
	
	/*
	 * Eðer tablodaki kolon ismini deðiþken isminden farklý bir isim olarak
	 * oluþturmak istersek @Column(name="student_name") bu þekilde kullanabiliriz.
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
