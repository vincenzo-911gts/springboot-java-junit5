package com.vincenzo.junit5.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class ProductService {

    public List<Product> getProductList() {

        log.info("Get Product List.");

        Product product1 = Product.builder().name("product1").price(BigDecimal.valueOf(1111L)).productType(ProductType.FIRST_TYPE).build();
        Product product2 = Product.builder().name("product2").price(BigDecimal.valueOf(2222L)).productType(ProductType.FIRST_TYPE).build();
        Product product3 = Product.builder().name("product3").price(BigDecimal.valueOf(3333L)).productType(ProductType.SECOND_TYPE).build();
        Product product4 = Product.builder().name("product4").price(BigDecimal.valueOf(4444L)).productType(ProductType.THIRD_TYPE).build();
        Product product5 = Product.builder().name("product5").price(BigDecimal.valueOf(5555L)).productType(ProductType.THIRD_TYPE).build();

        return Arrays.asList(product1, product2, product3, product4, product5);
    }
}
