package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Borrower;
import com.hackathon.tekreaders.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class BorrowerServices {
  @Autowired
  private BorrowerRepository borrowerRepository;

  public List<Borrower> findAllBorrowers() {
    return borrowerRepository.findAll();
  }

  public Optional<Borrower> findBorrowerById(Integer integer) {
    return borrowerRepository.findById(integer);
  }

  public List<Borrower> addBorrower(Borrower borrower) {
    borrowerRepository.save(borrower);
    return borrowerRepository.findAll();
  }
  public void deleteBorrower(Integer integer) {
    borrowerRepository.deleteById(integer);
  }

  public ResponseEntity<Object> updateBorrower(Borrower borrower, Integer integer) {
    Optional<Borrower> optionalBorrower = borrowerRepository.findById(integer);
    if(!optionalBorrower.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    borrower.setBorrowid(integer);
    borrowerRepository.save(borrower);
    return ResponseEntity.noContent().build();

  }

}
