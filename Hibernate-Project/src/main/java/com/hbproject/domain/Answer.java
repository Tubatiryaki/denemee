package com.hbproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;


	@Column(nullable = false)
	private String title;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", title=" + title + ", description=" + description + ", question=" + question
				+ "]";
	}
	
}
