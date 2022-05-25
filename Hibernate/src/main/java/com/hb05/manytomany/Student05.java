package com.hb05.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student05 {
	
	@Id
	private int id;
	
	@Column(name="std_name")
	private String name;
	
	private int grade;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name="Student05_Book05",
	joinColumns = {@JoinColumn(name="std_id")},
		          inverseJoinColumns = {@JoinColumn(name="book_id")})
	private List<Book05> books=new ArrayList<>();

	
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
		return "Student05 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	public List<Book05> getBooks() {
		return books;
	}

	public void setBooks(List<Book05> books) {
		this.books = books;
	}



	
}
