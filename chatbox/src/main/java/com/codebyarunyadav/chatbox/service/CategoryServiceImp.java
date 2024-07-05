package com.codebyarunyadav.chatbox.service;

import java.util.List;
import java.util.function.Function;

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
		System.out.println("Hello india" + category.getParentId());
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
		 System.out.println("save was initiated");
		return categoryRepository.findById(categoryId).map(categoryUpdate -> {
			//categoryUpdate.setId(categoryId);
			categoryUpdate.setCategoryName(category.getCategoryName());
			categoryUpdate.setParentId(category.getParentId());
			return categoryRepository.save(categoryUpdate);
           
		}).orElseGet(() -> {
			return categoryRepository.save(category);
		});

	}

	@Override
	public void deleteCategoryById(Long CategoryId) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(CategoryId);

	}

	public Category getCategoryById(Long categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(categoryId).get();

	}

}
