package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Books;
import com.hackathon.tekreaders.services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class BooksController {

  @Autowired
  private BooksServices booksServices;

  @GetMapping(value = "/books")
  public List<Books> getBooks() {
    return booksServices.findAllBooks();
  }

  @PostMapping(value = "/books/add")
  public List<Books> addBooks(@RequestBody Books books) {
    return booksServices.addBooks(books);
  }

//  @DeleteMapping(value = "/books/remove/{id}")
//  public void deleteBook(@PathVariable("id") BigInteger id) {
//    booksServices.delete(id);
//  }

  @PutMapping(value = "/books/updateStatus/available/{isbn}")
  public ResponseEntity<Object> updateStatusAvialale(@PathVariable ("isbn") Integer integer, @RequestBody Books books) {
    return booksServices.updateStatusToAvialable(books,integer);
  }

  @PutMapping(value = "/books/updateStatus/notAvailable/{id}")
  public ResponseEntity<Object> updateStatusNotAvialable(@PathVariable ("id") Integer integer, @RequestBody Books books) {
    return booksServices.updateStatusToNotAvialable(books,integer);
  }

  @GetMapping(value = "/books/getByTitle/{title}")
  public Optional<Books> getByBookTitle(@PathVariable("title") String string) {
    return booksServices.getBooksByTitle(string);
  }
  @GetMapping(value = "/books/{isbn}")
  public Optional<Books> getByIsbn(@PathVariable("isbn") Integer integer) {
    return booksServices.findByIsbn(integer);
  }
  @DeleteMapping(value = "/books/remove/{isbn}")
  public void deleteByIsbn(@PathVariable ("isbn") Integer integer) {
    booksServices.delete(integer);
  }
}
