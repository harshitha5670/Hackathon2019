package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {
//  Optional<Comments> getByIsbn(Integer integer);
}
