package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.model.Response;
import com.example.demo.repo.QuestionRepo;
import com.example.demo.repo.ResponseRepo;
import com.example.demo.repo.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseServiceImpl implements ResponseService{

    @Autowired
    private ResponseRepo responseRepo;

    @Autowired
    private QuestionRepo questionRepo;

    @Autowired
    private SessionRepo sessionRepo;

    @Override
    public List<Response> getAllResponses(long sessionNumber){
        return responseRepo.getAllBySessionNumber(sessionNumber);
    }

    @Override
    public float getSessionAverageScore(long sessionNumber){
        List<Response> responses = responseRepo.getAllBySessionNumber(sessionNumber);
        String paperTitle = sessionRepo.getBySessionNumber(sessionNumber).getPaperTitle();
        int output = 0;
        for(int i = 0; i < responses.size(); i++){
            int questionNumber = responses.get(i).getQuestionNumber();
            Question question = questionRepo.getByPaperTitleAndQuestionNumber(paperTitle,questionNumber);
            String questionAnswer = question.getQuestionAnswer();
            String studentChoice = responses.get(i).getStudentChoice();
            if(studentChoice.equals(questionAnswer)){
                output += 10; // one question gain is 10
            }
        }
        float result = (float)output/responses.size();
        return result;
    }

}
