package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.BookStatus;
import com.hackathon.tekreaders.repository.BookStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class BookStatusServices {

  @Autowired
  private BookStatusRepository bookStatusRepository;

  public List<BookStatus> getBookStatus() {
    return bookStatusRepository.findAll();
  }

  public Optional<BookStatus> getBookStatusById(Integer id) {
    return bookStatusRepository.findById(id);

  }
}
