package com.favstore.catalog.serviceapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.favstore.catalog.serviceapp.exception.ResourceNotFoundException;
import com.favstore.catalog.serviceapp.model.ProductCatalog;
import com.favstore.catalog.serviceapp.model.SearchCriteria;

@Service
public class BusinessService {

	private static final Logger logger = LoggerFactory.getLogger(CatalogService.class);

	@Autowired
	private CatalogService catalogService;
	
	public ProductCatalog getProductCatalogByCriteria(SearchCriteria criteria)
			throws ResourceNotFoundException {
		logger.info("getProductCatalog invoked");
		ProductCatalog productCatalog=new ProductCatalog();
		try {			
			productCatalog=catalogService.getProductCatalog();
			//productCatalog.getCatagories().stream().filter();
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error occur !!",e);
		}
		
		return productCatalog;
	}
}
