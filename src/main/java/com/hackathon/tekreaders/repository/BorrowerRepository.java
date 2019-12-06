package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower,Integer> {
}
