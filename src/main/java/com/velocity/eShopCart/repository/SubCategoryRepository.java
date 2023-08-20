package com.velocity.eShopCart.repository;

import java.io.Serializable;

/*import org.springframework.data.jpa.repository.JpaRepository;
*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.eShopCart.model.SubCategory;

@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategory, Serializable> {

	
}
