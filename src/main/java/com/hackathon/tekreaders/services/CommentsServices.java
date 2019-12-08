package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Books;
import com.hackathon.tekreaders.model.Comments;
import com.hackathon.tekreaders.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class CommentsServices  {

  @Autowired
  private CommentsRepository commentsRepository;

  public List<Comments> findComments() {
    return commentsRepository.findAll();
  }

  public List<Comments> addComments(Comments comments) {
    commentsRepository.save(comments);
    return commentsRepository.findAll();
  }
  public ResponseEntity<Object> updateComment(Comments comments, Integer integer) {
    Optional<Comments> optionalComments = commentsRepository.findById(integer);
    if(!optionalComments.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    comments.setCommentid(integer);
    commentsRepository.save(comments);
    return ResponseEntity.noContent().build();

  }
//  public Optional<Comments> getByIsbn(Integer integer) {
//    return commentsRepository.getByIsbn(integer);
//
//  }

}
