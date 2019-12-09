package com.favstore.catalog.serviceapp.unittest.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.favstore.catalog.serviceapp.exception.ResourceNotFoundException;
import com.favstore.catalog.serviceapp.model.ProductCatalog;
import com.favstore.catalog.serviceapp.repository.InventoryRepository;
import com.favstore.catalog.serviceapp.repository.ProductCategoryRepository;
import com.favstore.catalog.serviceapp.service.CatalogService;
import com.favstore.catalog.serviceapp.unittest.AppData;

import org.junit.runner.RunWith;


@RunWith(MockitoJUnitRunner.class)
public class CatalogServiceTest {

	@InjectMocks
	CatalogService catalogService;
	
	@Mock ProductCategoryRepository  productCategoryRepository;
	@Mock InventoryRepository inventoryRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testGetProductCatalog() throws ResourceNotFoundException {		
		Mockito.when(productCategoryRepository.findAll()).thenReturn(AppData.getProductCategories());
		Mockito.when(inventoryRepository.findByProductCategory_Id(Mockito.any())).thenReturn(AppData.getInventories());
		
		ProductCatalog productCatalog=  catalogService.getProductCatalog();	
		assertNotNull(productCatalog);
	}
	
}
