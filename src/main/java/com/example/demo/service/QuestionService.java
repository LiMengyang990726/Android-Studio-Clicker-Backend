package com.example.demo.service;

import com.example.demo.model.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions();

    List<Question> getQuestionsByPaperTitle(String paperTitle);

    String getQuestionAnswerByQuestionBody(String questionBody);

    Question addQuestion(Question question);

    // current stage, no update and delete
}
