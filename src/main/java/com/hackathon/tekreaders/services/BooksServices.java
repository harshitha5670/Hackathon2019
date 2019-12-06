package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Books;
import com.hackathon.tekreaders.repository.BookStatusRepository;
import com.hackathon.tekreaders.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class BooksServices {

  @Autowired
  private BooksRepository repository;

  public List<Books> findAllBooks() {
    return repository.findAll();
  }

  public Optional<Books> findById(Integer id) {
    return repository.findById(id);
  }

  public List<Books> addBooks(Books books) {
    repository.save(books);
    return repository.findAll();
  }

  public void delete(Integer id) {
    repository.deleteById(id);
  }

}
