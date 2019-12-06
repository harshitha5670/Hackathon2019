package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Sponsor;
import com.hackathon.tekreaders.services.SponsorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class SponsorController {

  @Autowired
  private SponsorServices sponserServices;

  @GetMapping(value = "/sponsors")
  public List<Sponsor> getSponsers() {
    return sponserServices.findAllSponsers();
  }

  @GetMapping(value = "/sponsors/{id}")
  public Optional<Sponsor> getSponserById(@PathVariable("id") Integer id){
    return sponserServices.findSponsersById(id);
  }

  @PostMapping(value = "/sponsors/add")
  public List<Sponsor> addSponser(@RequestBody Sponsor books) {
    return sponserServices.addSponsers(books);
  }

  @PutMapping(value = "/sponsors/update/{id}")
  public ResponseEntity<Object> updateSponser(@RequestBody Sponsor sponser, @PathVariable("id") Integer integer){
    return sponserServices.updateSponser(sponser,integer);
  }

  @DeleteMapping(value = "/sponsors/remove/{id}")
  public void deleteBook(@PathVariable("id") Integer id) {
    sponserServices.deleteSponsers(id);
  }
}
