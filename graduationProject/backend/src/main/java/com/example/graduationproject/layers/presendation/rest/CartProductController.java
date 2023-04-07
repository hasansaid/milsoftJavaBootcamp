package com.example.graduationproject.layers.presendation.rest;

import com.example.graduationproject.layers.business.dto.CartProductDto;
import com.example.graduationproject.layers.business.service.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart-product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CartProductController {

    @Autowired
    private CartProductService cartProductService;

    @GetMapping("/list/{cartId}")
    public List<CartProductDto> getCartProductsByCartId(@PathVariable int cartId) {
        return cartProductService.getCartProductsByCartId(cartId);
    }
}