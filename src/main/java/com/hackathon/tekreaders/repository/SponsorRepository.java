package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor,Integer> {
//  Optional<Sponsor> getByIsbn(Integer integer);
//  Optional<Sponsor> getByEmpid(Integer integer);
}
