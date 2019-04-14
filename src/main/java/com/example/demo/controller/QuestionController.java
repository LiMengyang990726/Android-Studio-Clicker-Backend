package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public List<Question> getAll(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/nextquestion")
    public Question getNextQuestion(
            @RequestParam String paperTitle,
            @RequestParam int questionNumber
    ){
        return questionService.getQuestionsByPaperTitleAndQuestionNumber(paperTitle,questionNumber);
    }

    @PostMapping("/postquestion")
    public Question addQuestion(
            @Valid @RequestBody Question question
    ){
        return questionService.addQuestion(question);
    }
}
