package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower,Integer> {
//  Optional<Borrower> getByIsbn(Integer integer);
//  Optional<Borrower> getByEmpid(Integer integer);



}
