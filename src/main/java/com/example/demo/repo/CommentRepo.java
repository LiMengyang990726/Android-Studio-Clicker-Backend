package com.example.demo.repo;

import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment,String> {
    List<Comment> getCommentsByStaffName(String staffName);
    Comment save(Comment comment);
}
