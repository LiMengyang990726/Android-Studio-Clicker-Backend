package com.example.demo.service;

import com.example.demo.repo.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    SessionRepo sessionRepo;

    @Override
    public long getPaperTitle(long sessionNumber){
        return sessionRepo.getBySessionNumber(sessionNumber).getSessionNumber();
    }
}
