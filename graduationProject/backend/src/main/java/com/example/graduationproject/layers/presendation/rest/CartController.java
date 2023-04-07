package com.example.graduationproject.layers.presendation.rest;

import com.example.graduationproject.layers.business.dto.CartDto;
import com.example.graduationproject.layers.business.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/get/{id}")
    public ResponseEntity<CartDto> getCartById(@PathVariable("id") int id) {
        CartDto cartDto = cartService.getCartById(id);
        return ResponseEntity.ok(cartDto);
    }

    @PostMapping("/add/{cartid}/{productid}")
    public ResponseEntity<String> addProductToCart(@PathVariable("cartid") int cartid, @PathVariable("productid") int productid, @RequestParam int quantity) {
        cartService.addProductToCart(cartid, productid, quantity);
        return ResponseEntity.ok("Product added to cart successfully.");
    }

    @DeleteMapping("/remove/{cartid}/{productid}")
    public ResponseEntity<String> removeProductFromCart(@PathVariable("cartid") int cartid, @PathVariable("productid") int productid) {
        cartService.removeProductFromCart(cartid, productid);
        return ResponseEntity.ok("Product removed from cart successfully.");
    }

    @PostMapping("/checkout/{id}")
    public ResponseEntity<String> checkoutCart(@PathVariable int id) {
        cartService.checkoutCart(id);
        return ResponseEntity.ok("Cart checked out successfully.");
    }
}
