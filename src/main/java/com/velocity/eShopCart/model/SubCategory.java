package com.velocity.eShopCart.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", nullable = false)
	private Date createddate;
	@PrePersist
	private void onCreate() {
		createddate = new Date();
	}

	@CreatedBy
	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "creategoryId")
	private int categoryId;
	
	
	public SubCategory(int subCategoryId, String subCategoryName, String description, Date createddate,
			String createdBy, int categoryId) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.description = description;
		this.createddate = createddate;
		this.createdBy = createdBy;
		this.categoryId = categoryId;
	}

	public SubCategory() {
		super();
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
				+ description + ", createddate=" + createddate + ", createdBy=" + createdBy + ", categoryId="
				+ categoryId + "]";
	}

	

	

}
