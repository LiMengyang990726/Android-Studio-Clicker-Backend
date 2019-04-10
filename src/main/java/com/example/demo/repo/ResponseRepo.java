package com.example.demo.repo;

import com.example.demo.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponseRepo extends JpaRepository<Response, String> {

    List<Response> getAllBySessionNumber(long sessionNumber);
}
