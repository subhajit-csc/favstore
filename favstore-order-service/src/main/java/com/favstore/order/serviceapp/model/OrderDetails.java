package com.favstore.order.serviceapp.model;

import java.util.List;

import com.favstore.order.serviceapp.entity.PaymentStatus;

public class OrderDetails {

	private String orderNumber;	
	private String description;
	private String sku;	
	private String customerId;	
	private Double subtotal;
	private Double total;
	private Double discount;	
	private String currency;
	private String paymentId;
	private String paymentDetails;
	private PaymentStatus paymentStatus;
	List<OrderItemDetails> oItemDetails;
	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the subtotal
	 */
	public Double getSubtotal() {
		return subtotal;
	}
	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	/**
	 * @return the discount
	 */
	public Double getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the paymentId
	 */
	public String getPaymentId() {
		return paymentId;
	}
	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	/**
	 * @return the paymentDetails
	 */
	public String getPaymentDetails() {
		return paymentDetails;
	}
	/**
	 * @param paymentDetails the paymentDetails to set
	 */
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	/**
	 * @return the paymentStatus
	 */
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	/**
	 * @return the oItemDetails
	 */
	public List<OrderItemDetails> getoItemDetails() {
		return oItemDetails;
	}
	/**
	 * @param oItemDetails the oItemDetails to set
	 */
	public void setoItemDetails(List<OrderItemDetails> oItemDetails) {
		this.oItemDetails = oItemDetails;
	}
	
	
	
	
	
}
