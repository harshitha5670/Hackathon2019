package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Comments;
import com.hackathon.tekreaders.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
