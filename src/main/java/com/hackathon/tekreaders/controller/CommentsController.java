package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Comments;
import com.hackathon.tekreaders.services.CommentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class CommentsController {

  @Autowired
  private CommentsServices services;

  @GetMapping(value = "/comments")
  public List<Comments> getComments() {
    return services.findComments();
  }

//  @GetMapping(value = "/comments/{id}")
//  public Optional<Comments> getCommentById(@PathVariable("id") Integer integer) {
//    return services.getByIsbn(integer);
//  }

  @PostMapping(value = "/comments/add")
  public List<Comments> postComment(@RequestBody Comments comments) {
    return services.addComments(comments);
  }

  @PutMapping(value = "/comments/add/{id}")
  public ResponseEntity<Object> updateComment(@RequestBody Comments comments, @PathVariable Integer integer) {
    return services.updateComment(comments,integer);
  }

}
