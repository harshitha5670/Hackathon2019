package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Authors;
import com.hackathon.tekreaders.services.AuthorsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class AuthorsController {

  @Autowired
  private AuthorsServices services;

  @GetMapping(value = "/authors")
  public List<Authors> getAuthors() {
    return services.findAllAuthors();
  }

  @GetMapping(value = "/authors/{id}")
  public Optional<Authors> getById(@PathVariable("id") Integer id){
    return services.findByid(id);

  }
  @PostMapping(value = "/authors/add")
  public List<Authors> addAuthors(@RequestBody Authors authors){
      return services.add(authors);
  }

  @DeleteMapping(value = "/authors/remove/{id}")
  public void delete(@PathVariable("id") Integer id){
    services.delete(id);
  }
}
