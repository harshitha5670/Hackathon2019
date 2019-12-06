package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Authors;
import com.hackathon.tekreaders.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class AuthorsServices {

  @Autowired
  private AuthorsRepository authorsRepository;

  public List<Authors> findAllAuthors(){
    return authorsRepository.findAll();
  }

  public Optional<Authors> findByid(Integer id){
    Optional<Authors> optionalAuthors = authorsRepository.findById(id);
    return authorsRepository.findById(id);
  }

  public void delete(Integer id){
    authorsRepository.deleteById(id);
  }
  public List<Authors> add(Authors authors) {
    authorsRepository.save(authors);
    return authorsRepository.findAll();
  }
}
