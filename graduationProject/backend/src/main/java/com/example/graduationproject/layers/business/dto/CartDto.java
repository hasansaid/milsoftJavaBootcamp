package com.example.graduationproject.layers.business.dto;

import com.example.graduationproject.layers.data.entity.Cart;
import com.example.graduationproject.layers.data.entity.CartStatus;
import lombok.Data;

import java.util.List;

@Data
public class CartDto {
    private int cartId;

    private String customerName;

    private String cardNumber;

    private CartStatus cartStatus;

    private List<CartProductDto> cartProducts;
}
