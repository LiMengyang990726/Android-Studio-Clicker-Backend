package com.example.demo.service;

import com.example.demo.model.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions();

    Question getQuestionsByPaperTitleAndQuestionNumber(String paperTitle, int questionNumber);

    String getQuestionAnswerByPaperTitleAndQuestionNumber(String paperTitle, int questionNumber);

    Question addQuestion(Question question);

    // current stage, no update and delete
}
