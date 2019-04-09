package com.example.demo.service;

import com.example.demo.repo.QuestionRepo;
import com.example.demo.repo.ResponseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseServiceImpl extends ResponseService{

    @Autowired
    private ResponseRepo responseRepo;

    @Autowired
    private QuestionRepo questionRepo;

}
