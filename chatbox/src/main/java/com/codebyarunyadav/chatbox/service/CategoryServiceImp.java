package com.codebyarunyadav.chatbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebyarunyadav.chatbox.entity.Category;
import com.codebyarunyadav.chatbox.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService {
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
		return null;
	}

	@Override
	public List<Category> fetchCategoryList() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category updateCategory(Category category, Long categoryId) {
		// TODO Auto-generated method stub
		//categoryRepository.s
		return null;
	}

	@Override
	public void deleteCategoryById(Long CategoryId) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(CategoryId);

	}

	public void getCategoryById(Long categoryId) {
		// TODO Auto-generated method stub
		categoryRepository.getById(categoryId);

	}

}
