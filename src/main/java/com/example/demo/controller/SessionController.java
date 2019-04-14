package com.example.demo.controller;

import com.example.demo.model.Session;
import com.example.demo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/session")
public class SessionController {
    @Autowired
    SessionService sessionService;

    @PostMapping("/newsession")
    public Session addNewSession(
            @Valid @RequestBody Session session
    ){
        return sessionService.addSession(session);
    }

    @GetMapping("/getsessionpaper")
    public String getPaperTitleOfSession(
            @RequestParam long sessionNumber
    ){
        return sessionService.getPaperTitle(sessionNumber);
    }
}
