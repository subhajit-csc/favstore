package com.favstore.catalog.serviceapp.controller;

import javax.validation.Valid;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.favstore.catalog.serviceapp.exception.ResourceNotFoundException;
import com.favstore.catalog.serviceapp.model.ProductCatalog;
import com.favstore.catalog.serviceapp.model.SearchCriteria;
import com.favstore.catalog.serviceapp.service.BusinessService;
import com.favstore.catalog.serviceapp.service.CatalogService;

@RestController
@RequestMapping("/v1/api")
public class CatalogServiceController {

	@Autowired
	private CatalogService catalogService;
	@Autowired
	private BusinessService businessService;

	/**
	 * Check Product Catalogs
	 * @return ProductCatalog
	 * @throws ResourceNotFoundException
	 */
	@GetMapping("/productCatalogs")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ResponseEntity<ProductCatalog> getProductCatalogss()
			throws ResourceNotFoundException {

		try {
			ProductCatalog productCatalog = catalogService.getProductCatalog();
			return ResponseEntity.ok().body(productCatalog);
		} catch (ResourceNotFoundException e) {
			throw e;
		}
	}
	/**
	 * Check Product Catalogs by criteria
	 * @param SearchCriteria
	 * @return ProductCatalog
	 * @throws ResourceNotFoundException
	 */
	@PostMapping("/productCatalogs")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ResponseEntity<ProductCatalog> getProductCatalogssBySearchCriteria(@Valid @RequestBody SearchCriteria searchCriteria)
			throws ResourceNotFoundException {

		try {
			ProductCatalog productCatalog = businessService.getProductCatalogByCriteria(searchCriteria);
			return ResponseEntity.ok().body(productCatalog);
		} catch (ResourceNotFoundException e) {
			throw e;
		}
	}


}
