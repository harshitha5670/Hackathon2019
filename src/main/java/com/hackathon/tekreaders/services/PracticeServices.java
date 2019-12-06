package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Practice;
import com.hackathon.tekreaders.repository.PracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class PracticeServices {

  @Autowired
  private PracticeRepository practiceRepository;

  public List<Practice> findAllPractices() {
    return practiceRepository.findAll();
  }

  public Optional<Practice> findPracticeById(Integer integer) {
    return practiceRepository.findById(integer);
  }

  public List<Practice> addPractice(Practice practice) {
    practiceRepository.save(practice);
    return practiceRepository.findAll();
  }
}
