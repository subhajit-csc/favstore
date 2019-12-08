package com.favstore.catalog.serviceapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String details;
	private String sku;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_category", nullable = false)
	private ProductCategory productCategory;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_pricing", nullable = false)
	private ProductPricing productPricing;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller_id", nullable = false)
	private Sellor sellor;
	private Double stock_unit;
	@Column(name="is_available")
	private Boolean isAvailable;
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
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the productCategory
	 */
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCatagory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}
	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	/**
	 * @return the productPricing
	 */
	public ProductPricing getProductPricing() {
		return productPricing;
	}
	/**
	 * @param productPricing the productPricing to set
	 */
	public void setProductPricing(ProductPricing productPricing) {
		this.productPricing = productPricing;
	}
	/**
	 * @return the sellor
	 */
	public Sellor getSellor() {
		return sellor;
	}
	/**
	 * @param sellor the sellor to set
	 */
	public void setSellor(Sellor sellor) {
		this.sellor = sellor;
	}
	/**
	 * @return the stock_unit
	 */
	public Double getStock_unit() {
		return stock_unit;
	}
	/**
	 * @param stock_unit the stock_unit to set
	 */
	public void setStock_unit(Double stock_unit) {
		this.stock_unit = stock_unit;
	}
	/**
	 * @return the isAvailable
	 */
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	
	
}