package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStatusRepository extends JpaRepository<BookStatus,Integer> {
}
