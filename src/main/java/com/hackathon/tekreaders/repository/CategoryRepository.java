package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
//  Optional<Category> getByName(String string);
}
