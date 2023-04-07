package com.example.graduationproject.layers.business.dto;

import lombok.Data;

@Data
public class CartProductDto {

    private int cartProductId;

    private ProductDto product;
    private int cartId;

    private int salesQuantity;
}
