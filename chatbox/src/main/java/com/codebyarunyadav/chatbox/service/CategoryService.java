package com.codebyarunyadav.chatbox.service;

import java.util.List;

import com.codebyarunyadav.chatbox.entity.Category;

 public interface CategoryService {

    // Save operation
    Category saveCategory(Category category);
 
    // Read operation
    List<Category> fetchCategoryList();
 
    // Update operation
    Category updateCategory(Category category,
                                Long categoryId);
 
    // Delete operation
    void deleteCategoryById(Long CategoryId);
}
