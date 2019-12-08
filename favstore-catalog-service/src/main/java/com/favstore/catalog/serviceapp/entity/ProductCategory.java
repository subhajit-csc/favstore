package com.favstore.catalog.serviceapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "product_category")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
	private Product product;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
	private Brand brand;
	@Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name="colour")
    private ColourCode colourCode;
	@Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name="size")
    private SizeTable sizeTable;
	private Boolean status;
	@Column(name = "created_on")
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	
	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the brand
	 */
	public Brand getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	/**
	 * @return the colourCode
	 */
	public ColourCode getColourCode() {
		return colourCode;
	}
	/**
	 * @param colourCode the colourCode to set
	 */
	public void setColourCode(ColourCode colourCode) {
		this.colourCode = colourCode;
	}
	/**
	 * @return the sizeTable
	 */
	public SizeTable getSizeTable() {
		return sizeTable;
	}
	/**
	 * @param sizeTable the sizeTable to set
	 */
	public void setSizeTable(SizeTable sizeTable) {
		this.sizeTable = sizeTable;
	}
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	
}