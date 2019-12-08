package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsersReppository extends JpaRepository<Users,Integer> {
 Optional<Users> findByEmail (String email);
}
