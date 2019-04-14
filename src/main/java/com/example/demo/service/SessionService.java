package com.example.demo.service;

import com.example.demo.model.Session;

public interface SessionService{
    String getPaperTitle(long sessionNumber);

    Session addSession(Session session);
}
