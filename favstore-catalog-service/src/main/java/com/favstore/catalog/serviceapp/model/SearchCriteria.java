package com.favstore.catalog.serviceapp.model;

import com.favstore.catalog.serviceapp.entity.ColourCode;
import com.favstore.catalog.serviceapp.entity.SizeTable;

public class SearchCriteria {

	private String brand;	
	private SizeTable size;	
	private ColourCode colour;	
	private String sku;
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
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
	
	
	
	
}
