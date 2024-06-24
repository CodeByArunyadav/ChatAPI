package com.codebyarunyadav.chatbox.controller;

import java.awt.PageAttributes.MediaType;

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

	@RequestMapping(method = RequestMethod.POST, value = "/category/add")
	public ResponseEntity<Boolean> addCategory(@RequestBody Category category) {
		categoryService.saveCategory(category);
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/category/get/by/id/{categoryId}")
	public void getCategoryById(@PathVariable Long categoryId) {
		categoryService.getCategoryById(categoryId);
	}

	/*
	 * @RequestMapping(method= RequestMethod.GET,
	 * value="/category/get/by/name/{categoryName}") public void
	 * getCategoryByName(@PathVariable String categoryName) {
	 * categoryService.getAllCategoriesByName(categoryName); }
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/all/category")
	public void getCategories() {
		categoryService.fetchCategoryList();
	}
}