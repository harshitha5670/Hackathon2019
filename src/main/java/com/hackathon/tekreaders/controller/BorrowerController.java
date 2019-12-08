package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Borrower;
import com.hackathon.tekreaders.services.BorrowerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class BorrowerController {

  @Autowired
  private BorrowerServices borrowerServices;

  @GetMapping(value = "/borrower")
  public List<Borrower> getBooks() {
    return borrowerServices.findAllBorrowers();
  }

  @GetMapping(value = "/borrower/{id}")
  public Optional<Borrower> getBookById(@PathVariable("id") Integer id){
    return borrowerServices.findBorrowerById(id);
  }

  @PostMapping(value = "/borrower/add")
  public List<Borrower> addBooks(@RequestBody Borrower books) {
    return borrowerServices.addBorrower(books);
  }

  @PutMapping(value = "/borrower/update/{id}")
  public ResponseEntity<Object> updateBorrower(@RequestBody Borrower borrower, @PathVariable("id") Integer integer) {
    return borrowerServices.updateBorrower(borrower,integer);
  }

  @DeleteMapping(value = "/borrower/remove/{id}")
  public void deleteBook(@PathVariable("id") Integer id) {
    borrowerServices.deleteBorrower(id);
  }

//  @GetMapping(value = "/borrower/getByIsbn/{isbn}")
//  public Optional<Borrower> getByIsbn(@PathVariable Integer integer) {
//    return borrowerServices.getBorrowBooksByIsbn(integer);
//  }
//
//  @GetMapping(value = "/borrower/getByEmpid/{empid}")
//  public Optional<Borrower> getByEmpid(@PathVariable Integer integer) {
//    return borrowerServices.getBorrowBooksByEmpid(integer);
//  }
}
