package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.ReturnStatus;
import com.hackathon.tekreaders.services.ReturnStatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class ReturnStatusController {
  @Autowired
  private ReturnStatusServices returnStatusServices;

  @GetMapping(value = "/returnstatus")
  public List<ReturnStatus> getStatus() {
    return returnStatusServices.findAllReturnStatus();
  }

  @GetMapping(value = "/returnstatus/{id}")
  public Optional<ReturnStatus> getStatusById(@PathVariable ("id") Integer integer){
    return returnStatusServices.findStatusById(integer);
  }
}
