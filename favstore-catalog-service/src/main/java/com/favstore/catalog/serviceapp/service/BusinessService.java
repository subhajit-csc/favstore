package com.favstore.catalog.serviceapp.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.favstore.catalog.serviceapp.exception.ResourceNotFoundException;
import com.favstore.catalog.serviceapp.model.CategoryDetails;
import com.favstore.catalog.serviceapp.model.ItemDetails;
import com.favstore.catalog.serviceapp.model.ProductCatalog;
import com.favstore.catalog.serviceapp.model.SearchCriteria;

@Service
public class BusinessService {

	private static final Logger logger = LoggerFactory.getLogger(CatalogService.class);

	@Autowired
	private CatalogService catalogService;

	public ProductCatalog getProductCatalogByCriteria(SearchCriteria criteria) throws ResourceNotFoundException {
		logger.info("getProductCatalogByCriteria invoked with criteria");
		ProductCatalog productCatalog = new ProductCatalog();		
		try {
			ProductCatalog pCatalog = catalogService.getProductCatalog();
			if (null != criteria) {
				
				if (null != criteria.getColour()) {					
					Predicate<ItemDetails> predicates=CatalogPredicates.isColourMatch(criteria.getColour());
					List<CategoryDetails> catagories = pCatalog.getCatagories().stream()
							.filter(category -> category.getItemDetails().stream().allMatch(predicates))
							.collect(Collectors.toList());
					productCatalog.setCatagories(catagories);
				}else if (null != criteria.getSize()) {
					Predicate<ItemDetails>	predicates=CatalogPredicates.isSizeMatch(criteria.getSize());
					List<CategoryDetails> catagories = pCatalog.getCatagories().stream()
							.filter(category -> category.getItemDetails().stream().allMatch(predicates))
							.collect(Collectors.toList());
					productCatalog.setCatagories(catagories);
				}else if (null != criteria.getBrand() && !criteria.getBrand().isEmpty()) {
					Predicate<ItemDetails> predicates=CatalogPredicates.isBrandMatch(criteria.getBrand());
					List<CategoryDetails> catagories = pCatalog.getCatagories().stream()
							.filter(category -> category.getItemDetails().stream().allMatch(predicates))
							.collect(Collectors.toList());
					productCatalog.setCatagories(catagories);
				}else if (null != criteria.getSku() && !criteria.getSku().isEmpty()) {
					Predicate<ItemDetails> predicates=CatalogPredicates.isSkuMatch(criteria.getSku());
					List<CategoryDetails> catagories = pCatalog.getCatagories().stream()
							.filter(category -> category.getItemDetails().stream().allMatch(predicates))
							.collect(Collectors.toList());
					productCatalog.setCatagories(catagories);
				}else {
					productCatalog=pCatalog;
				} 
				
				
			}else {
				productCatalog=pCatalog;
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error occur !!", e);
		}

		return productCatalog;
	}

	@Scheduled(fixedDelay = 300000)
	private void updateProductCatalogCache() {
		try {
			catalogService.getProductCatalogExtended();
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error("Error occur !!", e);
		}

	}
}
