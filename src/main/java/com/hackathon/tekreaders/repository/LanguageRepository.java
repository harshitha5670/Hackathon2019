package com.hackathon.tekreaders.repository;

import com.hackathon.tekreaders.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Integer> {
//  Optional<Language> getByName(String string);
}
