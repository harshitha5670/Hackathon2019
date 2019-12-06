package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.BookStatus;
import com.hackathon.tekreaders.services.BookStatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class BookStatusController {

  @Autowired
  private BookStatusServices statusServices;

  @GetMapping(value = "/bookstatus")
  public List<BookStatus> getBookStatus() {
    return statusServices.getBookStatus();
  }

  @GetMapping(value = "/bookstatus/{id}")
  public Optional<BookStatus> getBookStatusById(@PathVariable("id") Integer id){
    return statusServices.getBookStatusById(id);
  }
}
