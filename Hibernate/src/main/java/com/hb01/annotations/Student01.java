package com.hb01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Veritabanýnda bir tablo karþýlýðý olduðunu gösterir.
@Entity
public class Student01 {

	//@Id annotation altýndaki deðiþkenin  primary key yapar.
	@Id
	private int id;
	
	
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
