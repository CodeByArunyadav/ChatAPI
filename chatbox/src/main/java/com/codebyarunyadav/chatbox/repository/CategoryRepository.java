package com.codebyarunyadav.chatbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyarunyadav.chatbox.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
