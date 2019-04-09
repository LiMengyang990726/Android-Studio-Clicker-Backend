package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public List<Question> getAllQuestions(){
        return questionRepo.findAll();
    }

    @Override
    public List<Question> getQuestionsByPaperTitle(String paperTitle){
        return questionRepo.getAllByPaperTitle(paperTitle);
    }

    @Override
    public String getQuestionAnswerByQuestionBody(String questionBody){
        Question question = questionRepo.getByQuestionBody(questionBody);
        return question.getQuestionAnswer();
    }

    @Override
    public Question addQuestion(Question question){
        return questionRepo.save(question);
    }
}
