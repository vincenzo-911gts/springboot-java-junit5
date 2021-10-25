package com.vincenzo.junit5.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.when;

@SpringJUnitConfig
public class ProductServiceTest {

    @Mock
    ProductService productService;

    @Test
    void getProductList() {

        Product product1 = Product.builder().name("product1").price(BigDecimal.valueOf(1111L)).productType(ProductType.FIRST_TYPE).build();

        List<Product> productList = new ArrayList<>();
        productList.add(product1);

        List<Product> expected = new ArrayList<>();
        expected.add(product1);

        given(productService.getProductList()).willReturn(expected);

        when(productService.getProductList())
                .thenReturn(expected);
//        then();

    }
}
