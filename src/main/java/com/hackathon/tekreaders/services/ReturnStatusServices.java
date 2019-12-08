package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.BookStatus;
import com.hackathon.tekreaders.model.ReturnStatus;
import com.hackathon.tekreaders.repository.ReturnStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

  public ResponseEntity<Object> updateStatus(ReturnStatus status, Integer integer) {
    Optional<ReturnStatus> bookStatus = returnStatusRepository.findById(integer);
    if(!bookStatus.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    status.setReturnid(integer);
    returnStatusRepository.save(status);
    return ResponseEntity.noContent().build();

  }
}
