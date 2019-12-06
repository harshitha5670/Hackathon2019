package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Practice;
import com.hackathon.tekreaders.services.PracticeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class PracticeController {

  @Autowired
  private PracticeServices practiceServices;

  @GetMapping(value = "/practice")
  public List<Practice> getParctice() {
    return practiceServices.findAllPractices();
  }

  @GetMapping(value = "/practice/{id}")
  public Optional<Practice> getPracticeById(@PathVariable ("id") Integer integer) {
    return practiceServices.findPracticeById(integer);
  }

  @PostMapping(value = "/practice/add")
  public List<Practice> addPractice(@RequestBody Practice practice) {
    return practiceServices.addPractice(practice);
  }
}
