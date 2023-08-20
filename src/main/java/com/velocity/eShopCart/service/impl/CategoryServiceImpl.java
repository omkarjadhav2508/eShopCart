package com.velocity.eShopCart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.eShopCart.repository.CategoryRepository;
import com.velocity.eShopCart.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository  categoryRepository ;

	@Override
	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);
		
		
	}

}
