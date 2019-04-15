package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/newcomment")
    public Comment addNewComment(
            @Valid @RequestBody Comment comment
    ) {
        return commentService.addNew(comment);
    }

    @GetMapping("/getcomment")
    public String[] getComment(
            @RequestParam String staffName
    ){
        return commentService.getAllCommentsByStaffName(staffName);
    }
}
