package com.favstore.catalog.serviceapp.service;

import java.util.function.Predicate;

import com.favstore.catalog.serviceapp.entity.ColourCode;
import com.favstore.catalog.serviceapp.entity.SizeTable;
import com.favstore.catalog.serviceapp.model.ItemDetails;

public class CatalogPredicates {

	public static Predicate<ItemDetails> isDummyPredicateMatch() {
		return item -> true;
	}
	public static Predicate<ItemDetails> isColourMatch(ColourCode colour) {
		return item -> item.getColour().equals(colour);
	}
	public static Predicate<ItemDetails> isSizeMatch(SizeTable size) {
		return item -> item.getSize().equals(size);
	}
	public static Predicate<ItemDetails> isBrandMatch(String brand) {
		return item -> item.getBrandType().getCode().equals(brand);
	}
	public static Predicate<ItemDetails> isSkuMatch(String sku) {
		return item -> item.getSku().equals(sku);
	}
}
