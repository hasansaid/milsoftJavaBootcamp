package com.example.graduationproject.layers.business.service;

import com.example.graduationproject.layers.business.dto.CartDto;

public interface CartService {
    CartDto getCartById(int cartId);

    void addProductToCart( int cartId, int productId, int quantity);

    void removeProductFromCart(int cartId, int productId);

    void checkoutCart(int cartId);
}
