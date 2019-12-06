package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors,Integer> {

}
