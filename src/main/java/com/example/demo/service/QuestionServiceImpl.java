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
    public Question getQuestionsByPaperTitleAndQuestionNumber(String paperTitle, int questionNumber){
        List<Question> questions = questionRepo.getAllByPaperTitle(paperTitle);
        for(int i = 0; i < questions.size(); i++){
            if(questions.get(i).getQuestionNumber() == questionNumber){
                return questions.get(i);
            }
        }
        return null;
    }

    @Override
    public String getQuestionAnswerByPaperTitleAndQuestionNumber(String paperTitle, int questionNumber){
        Question question = questionRepo.getByPaperTitleAndQuestionNumber(paperTitle,questionNumber);
        return question.getQuestionAnswer();
    }

    @Override
    public Question addQuestion(Question question){
        return questionRepo.save(question);
    }
}
