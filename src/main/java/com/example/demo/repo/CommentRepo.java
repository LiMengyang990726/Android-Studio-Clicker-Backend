package com.example.demo.repo;

import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,String> {
    String[] getCommentsByStaffName(String staffName);
    Comment save(Comment comment);
}
