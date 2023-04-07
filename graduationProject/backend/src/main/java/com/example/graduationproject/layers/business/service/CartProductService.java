package com.example.graduationproject.layers.business.service;

import com.example.graduationproject.layers.business.dto.CartProductDto;

import java.util.List;

public interface CartProductService {
    List<CartProductDto> getCartProductsByCartId(int cartId);
}
