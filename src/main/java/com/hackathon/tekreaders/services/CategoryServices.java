package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Category;
import com.hackathon.tekreaders.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class CategoryServices {

  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> findAllCategories() {
    return categoryRepository.findAll();
  }
  public Optional<Category> findCategoryById(Integer id) {
    return categoryRepository.findById(id);
  }
  public List<Category> addCategory(Category category){
    categoryRepository.save(category);
    return categoryRepository.findAll();
  }
//  public Optional<Category> findByCategoryName(String string) {
//    return categoryRepository.getByName(string);
//  }
}
