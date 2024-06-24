package com.codebyarunyadav.chatbox.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "category")
public class Category {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id", unique = true, nullable = false)
	private Long id;

	@Column(nullable = false)
	private String categoryName;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Product> products = new ArrayList<Product>();

	@ManyToOne
	@JoinColumn(name = "parent_id")
	@JsonIgnore
	private Category parentId;

	@OneToMany(mappedBy = "parentId")
	private List<Category> subCategories = new ArrayList<>();

}