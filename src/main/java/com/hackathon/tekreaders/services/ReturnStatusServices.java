package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.ReturnStatus;
import com.hackathon.tekreaders.repository.ReturnStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.nio.file.OpenOption;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class ReturnStatusServices {

  @Autowired
  private ReturnStatusRepository returnStatusRepository;

  public List<ReturnStatus> findAllReturnStatus() {
    return returnStatusRepository.findAll();
  }

  public Optional<ReturnStatus> findStatusById(Integer integer) {
    return returnStatusRepository.findById(integer);
  }
}
