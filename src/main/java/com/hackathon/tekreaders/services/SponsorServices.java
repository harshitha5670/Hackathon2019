package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Sponsor;
import com.hackathon.tekreaders.repository.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class SponsorServices {

  @Autowired
  private SponsorRepository sponserRepository;

  public List<Sponsor> findAllSponsers() {
    return sponserRepository.findAll();
  }

  public Optional<Sponsor> findSponsersById(Integer integer) {
    return sponserRepository.findById(integer);
  }

  public List<Sponsor> addSponsers(Sponsor sponser) {
    sponserRepository.save(sponser);
    return sponserRepository.findAll();
  }

  public ResponseEntity<Object> updateSponser(Sponsor sponser, Integer integer) {
    Optional<Sponsor> optionalSponser = sponserRepository.findById(integer);
    if(!optionalSponser.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    sponser.setSponsorid(integer);
    sponserRepository.save(sponser);
    return ResponseEntity.noContent().build();

  }
  public void deleteSponsers(Integer integer) {
    sponserRepository.deleteById(integer);
  }

//  public Optional<Sponsor> getByIsbn(Integer integer) {
//    return sponserRepository.getByIsbn(integer);
//  }
//
//  public Optional<Sponsor> getByEmpid(Integer integer) {
//    return  sponserRepository.getByEmpid(integer);
//  }
}
