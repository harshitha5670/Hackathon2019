package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends JpaRepository<Practice,Integer> {
}
