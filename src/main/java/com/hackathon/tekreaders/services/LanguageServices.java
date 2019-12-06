package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Language;
import com.hackathon.tekreaders.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class LanguageServices {

  @Autowired
  private LanguageRepository languageRepository;

  public List<Language> findAllLanguages() {
    return languageRepository.findAll();
  }

  public Optional<Language> findLanguageById(Integer id) {
    return languageRepository.findById(id);
  }

  public List<Language> addLanguage(Language language) {
    languageRepository.save(language);
    return languageRepository.findAll();
  }
}
