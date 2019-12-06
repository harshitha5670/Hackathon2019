package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Comments;
import com.hackathon.tekreaders.services.CommentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tekreaders")
public class CommentsController {

  @Autowired
  private CommentsServices services;

  @GetMapping(value = "/comments")
  public List<Comments> getComments() {
    return services.findComments();
  }

  @GetMapping(value = "/comments/add")
  public List<Comments> postComment(@RequestBody Comments comments) {
    return services.addComments(comments);
  }
}
