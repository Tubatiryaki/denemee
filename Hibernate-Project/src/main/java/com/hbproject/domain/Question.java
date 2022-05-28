package com.hbproject.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.hbproject.domain.enums.QuestionType;

@Entity
public class Question {

//	@PrePersist
//	public void prePersist() {
//		if(title==null) {
//			title="Default name";
//		}
//	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, unique = true)
	private String title;

	@Column(updatable = false)
	private LocalDateTime createdDate=LocalDateTime.now();
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private QuestionType type;

	@OneToMany(mappedBy="question", cascade = CascadeType.ALL)
	private List<Answer> answers=new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", createdDate=" + createdDate + ", answers=" + answers
				+ "]";
	}

	public QuestionType getType() {
		return type;
	}

	public void setType(QuestionType type) {
		this.type = type;
	}
	
	
}
