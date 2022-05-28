package com.hbproject.service;

import com.hbproject.domain.Question;

public interface IQuestionService {
	public void saveQuestion(Question question);
    public Question findById(Integer id);
    public void removeQuestion(Question question);
}
