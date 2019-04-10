package com.example.demo.service;

import com.example.demo.model.Comment;

public interface CommentService {
    String[] getAllCommentsByStaffName(String staffName);

    Comment addNew(Comment comment);
}
