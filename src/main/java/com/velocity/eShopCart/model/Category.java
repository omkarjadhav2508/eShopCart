package com.velocity.eShopCart.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "categoryname")
	private String categoryname;
	@Column(name = "description")
	private String description;
	@Column(name = "createddate")
	private Date createddate;

	@Column(name = "image")
	@Lob
	private byte image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
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

	public byte getImage() {
		return image;
	}

	public void setImage(byte image) {
		this.image = image;
	}

	public Category(int id, String categoryname, String description, Date createddate, byte image) {
		super();
		this.id = id;
		this.categoryname = categoryname;
		this.description = description;
		this.createddate = createddate;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryname=" + categoryname + ", description=" + description
				+ ", createddate=" + createddate + ", image=" + image + "]";
	}
	
	

}
