package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Category;
import com.hackathon.tekreaders.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class CategoryController {
  @Autowired
  private CategoryServices services;

  @GetMapping(value = "/category")
  public List<Category> getAllCategory() {
    return services.findAllCategories();
  }
  @GetMapping(value = "/category/{id}")
  public Optional<Category> getCategoryById(@PathVariable("id") Integer id){
    return services.findCategoryById(id);
  }
  @PostMapping(value = "/category/add")
  public List<Category> addCategory(@RequestBody Category category) {
    return services.addCategory(category);
  }
}
