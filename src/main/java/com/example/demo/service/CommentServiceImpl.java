package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepo commentRepo;

    @Override
    public String[] getAllCommentsByStaffName(String staffName){
        List<Comment> commentList = commentRepo.getCommentsByStaffName(staffName);
        String[] comments = new String[commentList.size()];
        for(int i = 0; i < commentList.size();i++){
            comments[i] = commentList.get(i).getComment();
        }
        return comments;
    }

    @Override
    public Comment addNew(Comment comment){
        return commentRepo.save(comment);
    }
}
