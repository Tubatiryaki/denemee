package com.hb04.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student04 {

	@Id
	private int id;

	// length:max karakter sayısını
	// nullable: ilgili kolonun null olup olmayacağını belirler. true yada false
	// olabilir
	// unique: Unique olması istenen alanlar bu attribute ile belirlenir. true ya da
	// false olabilir.
	// updatable: update edilebilir şekilde yarlamak için kullanılır.true yada false
	// alabilir. Default true
	// insertable: burasıda insert edilebilir değer yarlanabilir. true yada false
	// alabilir. Default true
	@Column(name = "std_name", length = 100, nullable = false, unique = true)
	private String name;

	private int grade;
 
	//CascadeType.ALL bütün cascade tiplerine sahiptir.
	//CascadeType.PERSIST parent persist edildiğinde ona bağlı olan tüm childlera bu işlem propagate (yayılır,uygulanır) edilir
	//CascadeType.REMOVE parent remove edildiğinde ona bağlı olan tüm childlera bu işlem propagate (yayılır,uygulanır) edilir
	@OneToMany(mappedBy ="student",orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Book04> bookList = new ArrayList<>();

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

	public List<Book04> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book04> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Student04 [id=" + id + ", name=" + name + ", grade=" + grade + ", bookList=" + bookList + "]";
	}
	
	
	

}
