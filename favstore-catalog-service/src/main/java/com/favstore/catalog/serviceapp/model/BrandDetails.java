package com.favstore.catalog.serviceapp.model;

import java.io.Serializable;

public class BrandDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8872147978799164693L;
	private String name;	
	private String code;
	
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
