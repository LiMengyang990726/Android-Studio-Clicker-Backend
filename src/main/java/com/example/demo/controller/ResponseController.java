package com.example.demo.controller;

import com.example.demo.model.Response;
import com.example.demo.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/response")
public class ResponseController {
    @Autowired
    ResponseService responseService;

    @PostMapping("/newresponse")
    public Response addNewResponse(
            @Valid @RequestBody Response response
    ){
        return responseService.addNewResponse(response);
    }

//    @GetMapping("/getscore")
//    public float getSessionAverageScore(
//            @RequestParam long sessionNumber
//    ){
//        return responseService.getSessionAverageScore(sessionNumber);
//    }

    @GetMapping("/getresponse")
    public int[] getAllResponse(
            @RequestParam long sessionNumber,
            @RequestParam int questionNumber
    ){
        int[] result = new int[4];
        result[0] = responseService.getNumberOfAResponse(sessionNumber, questionNumber);
        result[1] = responseService.getNumberOfBResponse(sessionNumber, questionNumber);
        result[2] = responseService.getNumberOfCResponse(sessionNumber, questionNumber);
        result[3] = responseService.getNumberOfDResponse(sessionNumber, questionNumber);
        return result;
    }
}
