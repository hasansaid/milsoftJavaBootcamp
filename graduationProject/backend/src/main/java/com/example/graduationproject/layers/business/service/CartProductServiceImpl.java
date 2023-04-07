package com.example.graduationproject.layers.business.service;

import com.example.graduationproject.layers.business.dto.CartProductDto;
import com.example.graduationproject.layers.business.dto.ProductDto;
import com.example.graduationproject.layers.data.entity.CartProduct;
import com.example.graduationproject.layers.data.entity.Product;
import com.example.graduationproject.layers.data.repository.CartProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CartProductServiceImpl implements CartProductService{
    private CartProductRepository cartProductRepository;
    public CartProductServiceImpl(CartProductRepository cartProductRepository){
        this.cartProductRepository=cartProductRepository;
    }
    @Override
    public List<CartProductDto> getCartProductsByCartId(int cartId) {
        List<CartProduct> cartProducts = cartProductRepository.findByCart_CartId(cartId);
        List<CartProductDto> cartProductDtos = new ArrayList<>();
        for (CartProduct cartProduct : cartProducts) {
            ProductDto productDto = new ProductDto();
            Product product = cartProduct.getProduct();
            productDto.setProductId(product.getProductId());
            productDto.setProductName(product.getProductName());

            CartProductDto cartProductDto = new CartProductDto();
            cartProductDto.setCartProductId(cartProduct.getCartProductId());
            cartProductDto.setCartId(cartProduct.getCart().getCartId());
            cartProductDto.setProduct(productDto);
            cartProductDto.setSalesQuantity(cartProduct.getSalesQuantity());

            cartProductDtos.add(cartProductDto);
        }
        return cartProductDtos;
    }
}
