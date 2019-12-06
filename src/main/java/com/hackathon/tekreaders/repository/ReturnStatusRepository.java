package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.ReturnStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnStatusRepository extends JpaRepository<ReturnStatus,Integer> {
}
