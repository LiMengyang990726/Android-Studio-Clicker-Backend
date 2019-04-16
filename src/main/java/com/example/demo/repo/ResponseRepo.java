package com.example.demo.repo;

import com.example.demo.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponseRepo extends JpaRepository<Response, String> {

    Response save(Response response);

    List<Response> getAllBySessionNumber(long sessionNumber);

    List<Response> getAllBySessionNumberAndQuestionNumber(long sessionNumber, int questionNumber);
}
