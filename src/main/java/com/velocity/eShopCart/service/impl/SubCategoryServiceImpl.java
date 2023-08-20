package com.velocity.eShopCart.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.eShopCart.model.SubCategory;
import com.velocity.eShopCart.repository.SubCategoryRepository;
import com.velocity.eShopCart.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	
	@Autowired
	private SubCategoryRepository subCategoryRepository;
	@Override
	public SubCategory saveSubCategory(SubCategory subCategory) {
		return subCategoryRepository.save(subCategory);
	}
	

}
