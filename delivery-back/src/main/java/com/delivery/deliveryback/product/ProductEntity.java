package com.delivery.deliveryback.product;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
public class ProductEntity {

	@JsonProperty
    private Integer customerSeq;

	@JsonProperty
    private String customerId;

	@JsonProperty
    private String customerPw;

	@JsonProperty
    private String customerEmail;

	@JsonProperty
    private String customerAddress;


	public ProductEntity(Integer customer_seq, String customerId, String customerPw, String customerAddress,
			String customerEmail) {
		this.customerSeq = customerSeq;
		this.customerId = customerId;
		this.customerPw = customerPw;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
	}


}
