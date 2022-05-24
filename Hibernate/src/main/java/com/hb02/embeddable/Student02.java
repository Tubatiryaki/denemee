package com.hb02.embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student02 {
	
	//@Id annotation altındaki değişkeni  primary key yapar.
		//Bu annotasyon her Entity sınıfında olmalı  
		@Id
		private int id;
		
		
		/*
		 * Eğer tablodaki kolon ismini değişken isminden farklı bir isim olarak
		 * oluşturmak istersek @Column(name="student_name") bu şekilde kullanabiliriz.
		 */
		
		@Column(name="student_name")
		private String name;
		
		@Column
		private int grade;
		
		
		private Course02 courses;

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
		
		public Course02 getCourses() {
			return courses;
		}
		
		public void setCourses(Course02 courses) {
			this.courses = courses;
		}
	
		
		@Override
		public String toString() {
			return "Student02 [id=" + id + ", name=" + name + ", grade=" + grade + ",courses="+courses+"]";
		}




}
