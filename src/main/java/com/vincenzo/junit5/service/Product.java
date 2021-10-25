package com.vincenzo.junit5.service;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
public class Product {

    private String name;
    private BigDecimal price;
    private ProductType productType;

    @Builder
    Product(String name, BigDecimal price, ProductType productType) {
        this.name = name;
        this.price = price;
        this.productType = productType;
    }
}
