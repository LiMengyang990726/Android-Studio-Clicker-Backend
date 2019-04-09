package com.example.demo.repo;

import com.example.demo.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepo extends JpaRepository<Response, String> {

}
