package com.favstore.catalog.serviceapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.favstore.catalog.serviceapp.entity.Inventory;
import com.favstore.catalog.serviceapp.entity.ProductCategory;
import com.favstore.catalog.serviceapp.exception.ResourceNotFoundException;
import com.favstore.catalog.serviceapp.model.BrandDetails;
import com.favstore.catalog.serviceapp.model.CategoryDetails;
import com.favstore.catalog.serviceapp.model.ItemDetails;
import com.favstore.catalog.serviceapp.model.ProductCatalog;
import com.favstore.catalog.serviceapp.repository.InventoryRepository;
import com.favstore.catalog.serviceapp.repository.ProductCategoryRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CatalogService {

	private static final Logger logger = LoggerFactory.getLogger(CatalogService.class);

	@Autowired
	private ProductCategoryRepository  productCategoryRepository;
	@Autowired
	private InventoryRepository inventoryRepository;

	@Cacheable("productCatalogs")
	public ProductCatalog getProductCatalog()
			throws ResourceNotFoundException {
		logger.info("getProductCatalog invoked");
		ProductCatalog productCatalog=new ProductCatalog();
		try {			
			
			List<CategoryDetails> catagorieList=new ArrayList<>();
			List<ProductCategory> productCategories=productCategoryRepository.findAll();			
			Map<Long, CategoryDetails> categoryMap=new HashMap<>();
			
			productCategories.stream().forEach(productCategory -> {
				BrandDetails brandDetails=new BrandDetails();
				brandDetails.setName(productCategory.getBrand().getName());
				brandDetails.setCode(productCategory.getBrand().getCode());
				
				ItemDetails iDetails=new ItemDetails();
				iDetails.setName(productCategory.getName());
				iDetails.setDescription(productCategory.getDescription());
				iDetails.setColour(productCategory.getColourCode());
				iDetails.setSize(productCategory.getSizeTable());
				iDetails.setBrandType(brandDetails);
				
				List<Inventory> inventories=inventoryRepository.findByProductCategory_Id(productCategory.getId());
				iDetails.setSku(inventories.get(0).getSku());
				iDetails.setPrice(inventories.get(0).getProductPricing().getRate());
				iDetails.setDiscount(inventories.get(0).getProductPricing().getDiscount());
				iDetails.setCurrency(inventories.get(0).getProductPricing().getCurrency().getCode());
				iDetails.setSellorCode(inventories.get(0).getSellor().getCode());
				iDetails.setSellorRating(String.valueOf(inventories.get(0).getSellor().getRating()));
				iDetails.setInStock(inventories.get(0).getIsAvailable());
				
				
				if (categoryMap.containsKey(productCategory.getProduct().getCategory().getId())) {
					CategoryDetails catagoryDetails=categoryMap.get(productCategory.getProduct().getCategory().getId());
					List<ItemDetails> itemDetails=catagoryDetails.getItemDetails();
					itemDetails.add(iDetails);
					categoryMap.put(productCategory.getProduct().getCategory().getId(), catagoryDetails);
					
				}else {
					CategoryDetails catagoryDetails=new CategoryDetails();
					catagoryDetails.setName(productCategory.getProduct().getCategory().getName());
					catagoryDetails.setType(productCategory.getProduct().getCategory().getCatagoryType().getName());
					List<ItemDetails> itemDetails=new ArrayList<>();
					itemDetails.add(iDetails);
					catagoryDetails.setItemDetails(itemDetails);
					categoryMap.put(productCategory.getProduct().getCategory().getId(), catagoryDetails);
				}			
				
			});
				catagorieList= categoryMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
			productCatalog.setCatagories(catagorieList);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error occur !!",e);
		}
		
		return productCatalog;
	}
	
	@CachePut("productCatalogs")
	public ProductCatalog getProductCatalogExtended() throws ResourceNotFoundException {
		logger.info("getProductCatalogExtended invoked");		
		return getProductCatalog();
	}
	
}
