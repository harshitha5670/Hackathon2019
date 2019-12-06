package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersReppository extends JpaRepository<Users,Integer> {
}
