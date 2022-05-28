package com.hbproject.main;

import com.hbproject.domain.Answer;
import com.hbproject.domain.Question;
import com.hbproject.domain.enums.QuestionType;
import com.hbproject.service.AnswerServiceImpl;
import com.hbproject.service.IAnswerServive;
import com.hbproject.service.IQuestionService;
import com.hbproject.service.QuestionServiceImpl;
import com.hbproject.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
	
		IQuestionService questionService=new QuestionServiceImpl();
		
//		Question question =new Question();
//		question.setTitle("is Hibernate difficult");
//		question.setType(QuestionType.NORMAL);
//		
//		questionService.saveQuestion(question);
		
		
		Question question = questionService.findById(2);
//		
//		questionService.removeQuestion(question);
		
		
		Answer answer=new Answer();
		answer.setTitle("Good Question");
		answer.setDescription("No, it isnt");
		answer.setQuestion(question);
		
		
		IAnswerServive answerService=new AnswerServiceImpl();
		answerService.saveAnswer(answer);
		
		
		HibernateUtil.getSessionFactory().close();
	}

}
