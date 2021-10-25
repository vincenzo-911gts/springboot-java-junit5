package com.vincenzo.junit5.service;

import lombok.Getter;

public enum ProductType {
    FIRST_TYPE(100),
    SECOND_TYPE(100),
    THIRD_TYPE(200);

    @Getter
    private int cost;

    ProductType(int cost) {
        this.cost = cost;
    }
}
