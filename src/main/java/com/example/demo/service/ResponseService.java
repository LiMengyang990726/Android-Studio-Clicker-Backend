package com.example.demo.service;

import com.example.demo.model.Response;

import java.util.List;

public interface ResponseService {
//    List<Response> getAllResponses(long sessionNumber);
//
//    float getSessionAverageScore(long sessionNumber);

    Response addNewResponse(Response response);

    int getNumberOfAResponse(long sessionNumber, int questionNumber);

    int getNumberOfBResponse(long sessionNumber, int questionNumber);

    int getNumberOfCResponse(long sessionNumber, int questionNumber);

    int getNumberOfDResponse(long sessionNumber, int questionNumber);
}
