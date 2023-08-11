package com.velocity.eShopCart.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subCategory")
public class SubCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subCategoryId")
	private int subCategoryId;

	@Column(name = "subCategoryName")
	private String subCategoryName;

	@Column(name = "description")
	private String description;

	@Column(name = "createddate")
	private Date createddate;

	@Column(name = "createdBy")
	private String creayedBy;

	@Column(name = "creategoryId")
	private int categoryId;

	public SubCategory(int subCategoryId, String subCategoryName, String description, Date createddate,
			String creayedBy, int categoryId) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.description = description;
		this.createddate = createddate;
		this.creayedBy = creayedBy;
		this.categoryId = categoryId;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getCreayedBy() {
		return creayedBy;
	}

	public void setCreayedBy(String creayedBy) {
		this.creayedBy = creayedBy;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName + ", description="
				+ description + ", createddate=" + createddate + ", creayedBy=" + creayedBy + ", categoryId="
				+ categoryId + "]";
	}

}
