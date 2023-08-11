package com.velocity.eShopCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.eShopCart.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
