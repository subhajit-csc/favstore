package com.favstore.catalog.serviceapp.model;

import java.io.Serializable;
import java.util.List;

public class ProductCatalog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3649076942780879428L;
	private List<CategoryDetails> catagories;

	/**
	 * @return the catagories
	 */
	public List<CategoryDetails> getCatagories() {
		return catagories;
	}

	/**
	 * @param catagories the catagories to set
	 */
	public void setCatagories(List<CategoryDetails> catagories) {
		this.catagories = catagories;
	}	
	
	
		
	
	


}
