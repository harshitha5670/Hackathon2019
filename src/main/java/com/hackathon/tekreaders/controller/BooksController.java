package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Books;
import com.hackathon.tekreaders.services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping(value = "/books/{id}")
  public Optional<Books> getBookById(@PathVariable ("id") Integer id){
    return booksServices.findById(id);
  }

  @PostMapping(value = "/books/add")
  public List<Books> addBooks(@RequestBody Books books) {
    return booksServices.addBooks(books);
  }

  @DeleteMapping(value = "/books/remove/{id}")
  public void deleteBook(@PathVariable("id") Integer id) {
    booksServices.delete(id);
  }
}
