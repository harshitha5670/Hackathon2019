package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {
  Optional<Books> getByIsbn(Integer integer);
  Optional<Books> getByTitle(String string);

}
