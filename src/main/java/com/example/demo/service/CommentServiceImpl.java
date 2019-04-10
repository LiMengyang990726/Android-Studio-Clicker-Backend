package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepo commentRepo;

    @Override
    public String[] getAllCommentsByStaffName(String staffName){
        return commentRepo.getCommentsByStaffName(staffName);
    }

    @Override
    public Comment addNew(Comment comment){
        return commentRepo.save(comment);
    }
}
