package com.hbproject.service;

import com.hbproject.domain.Question;
import com.hbproject.repository.QuestionRepository;

public class QuestionServiceImpl implements IQuestionService {

	private final static QuestionRepository repo=new QuestionRepository();
	
	@Override
	public void saveQuestion(Question question) {
		
	     //Business Logic burada gerçekleştiriliyor.
		repo.saveQuestion(question);
		
	}

	@Override
	public Question findById(Integer id) {
		return repo.getQuestion(id);
		
	}

	@Override
	public void removeQuestion(Question question) {
		repo.removeQuestion(question);
	}



}
