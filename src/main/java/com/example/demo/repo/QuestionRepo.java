package com.example.demo.repo;

import com.example.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, String> {

    List<Question> getAllByPaperTitle(String paperTitle);

    Question getByQuestionBody(String questionBody);

    Question getByPaperTitleAndQuestionNumber(String paperTitle, int questionNumber);

    Question save(Question question);
}
