package com.velocity.eShopCart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productId")
	private int productId;
	private String productName;
	private int subCategoryId;
	private String productDescription;
	private String brand;
	private String productCode;
	private Boolean featured;
	private String sequence;
	public Product(int productId, String productName, int subCategoryId, String productDescription, String brand,
			String productCode, Boolean featured, String sequence) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.subCategoryId = subCategoryId;
		this.productDescription = productDescription;
		this.brand = brand;
		this.productCode = productCode;
		this.featured = featured;
		this.sequence = sequence;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Boolean getFeatured() {
		return featured;
	}
	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", subCategoryId=" + subCategoryId
				+ ", productDescription=" + productDescription + ", brand=" + brand + ", productCode=" + productCode
				+ ", featured=" + featured + ", sequence=" + sequence + "]";
	}
	
	

}
