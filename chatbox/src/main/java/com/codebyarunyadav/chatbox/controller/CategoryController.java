package com.codebyarunyadav.chatbox.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codebyarunyadav.chatbox.entity.Category;
import com.codebyarunyadav.chatbox.service.CategoryServiceImp;

@RestController
//@Api(value = "CategoryAPI", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/ss")
public class CategoryController {
	@Autowired
	private CategoryServiceImp categoryService;
	
    @RequestMapping(value = "/")
	public String mainIndexPage()
	{
    	return "index.html";
	}
	// Save operation
	@RequestMapping(method = RequestMethod.POST, value = "/category/add")
	public ResponseEntity<Boolean> addCategory(@RequestBody Category category) {
		categoryService.saveCategory(category);
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}

	// Update operation
	@RequestMapping(method = RequestMethod.PUT, value = "/category/update/{categoryId}")

	public Category updateCategory(@RequestBody Category category, @PathVariable Long categoryId) {
		return categoryService.updateCategory(category, categoryId);
	}

	// Read operation by ID
	@RequestMapping(method = RequestMethod.GET, value = "/category/getbyid/{categoryId}")
	public Category getCategoryById(@PathVariable Long categoryId) {
		return categoryService.getCategoryById(categoryId);
	}

	// Read operation
	@RequestMapping(method = RequestMethod.GET, value = "/all/category")
	public ResponseEntity<List<Category>> getCategories() {
		List<Category> listCategory = categoryService.fetchCategoryList();
		return new ResponseEntity<List<Category>>(listCategory, HttpStatus.CREATED);
	}

	// Delete operation
	@RequestMapping(method = RequestMethod.DELETE, value = "/category/deletbyid/{categoryId}")
	public String deleteCategoryById(@PathVariable Long categoryId) {
		categoryService.deleteCategoryById(categoryId);
		return "This category ID Deleted Successfully.. ";
	}

}