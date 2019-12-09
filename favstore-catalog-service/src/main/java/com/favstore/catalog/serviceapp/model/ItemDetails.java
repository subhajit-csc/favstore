package com.favstore.catalog.serviceapp.model;

import java.io.Serializable;

import com.favstore.catalog.serviceapp.entity.ColourCode;
import com.favstore.catalog.serviceapp.entity.SizeTable;

public class ItemDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5732406044629659443L;
	private String name;	
	private String description;
	private String sku;
	private SizeTable size;	
	private ColourCode colour;
	private String sellorCode;	
	private String sellorRating;
	private String currency;
	private Double price;
	private Double discount;
	private Boolean inStock;
	private BrandDetails brandType;
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
	 * @return the size
	 */
	public SizeTable getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(SizeTable size) {
		this.size = size;
	}
	/**
	 * @return the colour
	 */
	public ColourCode getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(ColourCode colour) {
		this.colour = colour;
	}
	/**
	 * @return the sellorCode
	 */
	public String getSellorCode() {
		return sellorCode;
	}
	/**
	 * @param sellorCode the sellorCode to set
	 */
	public void setSellorCode(String sellorCode) {
		this.sellorCode = sellorCode;
	}
	/**
	 * @return the sellorRating
	 */
	public String getSellorRating() {
		return sellorRating;
	}
	/**
	 * @param sellorRating the sellorRating to set
	 */
	public void setSellorRating(String sellorRating) {
		this.sellorRating = sellorRating;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the discount
	 */
	public Double getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	/**
	 * @return the inStock
	 */
	public Boolean getInStock() {
		return inStock;
	}
	/**
	 * @param inStock the inStock to set
	 */
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	/**
	 * @return the brandType
	 */
	public BrandDetails getBrandType() {
		return brandType;
	}
	/**
	 * @param brandType the brandType to set
	 */
	public void setBrandType(BrandDetails brandType) {
		this.brandType = brandType;
	}	
	
	
	
}
