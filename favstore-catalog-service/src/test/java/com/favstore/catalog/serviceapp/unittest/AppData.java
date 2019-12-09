package com.favstore.catalog.serviceapp.unittest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.favstore.catalog.serviceapp.entity.Brand;
import com.favstore.catalog.serviceapp.entity.Category;
import com.favstore.catalog.serviceapp.entity.CategoryType;
import com.favstore.catalog.serviceapp.entity.ColourCode;
import com.favstore.catalog.serviceapp.entity.Currency;
import com.favstore.catalog.serviceapp.entity.Inventory;
import com.favstore.catalog.serviceapp.entity.Product;
import com.favstore.catalog.serviceapp.entity.ProductCategory;
import com.favstore.catalog.serviceapp.entity.ProductPricing;
import com.favstore.catalog.serviceapp.entity.Sellor;
import com.favstore.catalog.serviceapp.entity.SizeTable;

public class AppData {

	public static final Date CREATED_ON = new Date();
	
	public static List<ProductCategory> getProductCategories() {
		List<ProductCategory> productCategories=new ArrayList<>();
		ProductCategory pCatagory=new ProductCategory();
		pCatagory.setId(1L);
		pCatagory.setName("Topware");
		pCatagory.setDescription("Topware");
		pCatagory.setColourCode(ColourCode.BLACK);
		pCatagory.setSizeTable(SizeTable.L);
		Brand brand=new Brand();
		brand.setCode("Lee");
		brand.setName("Lee");
		pCatagory.setBrand(brand);
		
		CategoryType catagoryType=new CategoryType();
		catagoryType.setName("TopWare");
		Product product=new Product();
		Category category=new Category();
		category.setId(1L);
		category.setCatagoryType(catagoryType);
		product.setCategory(category);
		pCatagory.setProduct(product);
		
		
		
		productCategories.add(pCatagory);
		return productCategories;
	}
	public static List<Inventory> getInventories() {
		List<Inventory> inventories=new ArrayList<>();
		Inventory inventory=new Inventory();
		inventory.setSku("I1001");
		ProductPricing productPricing=new ProductPricing();
		productPricing.setRate(10.5);
		productPricing.setDiscount(10.5);
		Currency currency=new Currency();
		currency.setCode("INR");
		productPricing.setCurrency(currency);
		inventory.setProductPricing(productPricing);
		Sellor sellor=new Sellor();
		sellor.setCode("Myntra");
		sellor.setRating(8);
		inventory.setSellor(sellor);
		inventory.setIsAvailable(true);
		inventories.add(inventory);
		return inventories;
	}
			
}
