package com.example.demo.service;

import com.example.demo.model.Session;
import com.example.demo.repo.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    SessionRepo sessionRepo;

    @Override
    public String getPaperTitle(long sessionNumber){
        return sessionRepo.getBySessionNumber(sessionNumber).getPaperTitle();
    }

    @Override
    public Session addSession(Session session){
        return sessionRepo.save(session);
    }
}
