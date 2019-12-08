package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Books;
import com.hackathon.tekreaders.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
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

  public List<Books> addBooks(Books books) {
    repository.save(books);
    return repository.findAll();
  }
  public ResponseEntity<Object> updateStatusToAvialable(Books books, Integer integer) {
    Optional<Books> optionalBooks = repository.getByIsbn(integer);
    if(!optionalBooks.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    books.setIsbn(integer);
    repository.save(books);
    return ResponseEntity.noContent().build();
  }
  public ResponseEntity<Object> updateStatusToNotAvialable(Books books, Integer integer) {
    Optional<Books> optionalBooks = repository.getByIsbn(integer);
    if(!optionalBooks.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    books.setIsbn(integer);
    repository.save(books);
    return ResponseEntity.noContent().build();
  }

  public Optional<Books> getBooksByTitle(String title) {

    return repository.getByTitle(title);
  }
  public void delete(Integer integer){
    repository.deleteById(integer);
  }

  public Optional<Books> findByIsbn(Integer isbn) {
    return repository.getByIsbn(isbn);
  }


}
