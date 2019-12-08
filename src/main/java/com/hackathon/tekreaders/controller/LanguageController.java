package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Language;
import com.hackathon.tekreaders.services.LanguageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class LanguageController {

  @Autowired
  private LanguageServices services;

  @GetMapping(value = "/language")
  public List<Language> getlanguage() {
    return services.findAllLanguages();
  }

  @GetMapping(value = "/language/{id}")
  public Optional<Language> getlanguageById(@PathVariable ("id") Integer integer) {
    return services.findLanguageById(integer);
  }

  @PostMapping(value = "/language/add")
  public List<Language> addlanguage(@RequestBody Language language) {
    return services.addLanguage(language);
  }

}
