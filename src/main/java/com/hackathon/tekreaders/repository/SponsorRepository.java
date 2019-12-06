package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor,Integer> {
}
