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
        return ResponseEntity.ok("Ürün sepete eklendi.");
    }

    @PostMapping("/minus/{cartid}/{productid}")
    public ResponseEntity<String> minusProductToCart(@PathVariable("cartid") int cartid, @PathVariable("productid") int productid, @RequestParam int quantity) {
        cartService.minusProductToCart(cartid, productid, quantity);
        return ResponseEntity.ok("Ürün sepete eklendi.");
    }

    @DeleteMapping("/remove/{cartid}/{productid}")
    public ResponseEntity<String> removeProductFromCart(@PathVariable("cartid") int cartid, @PathVariable("productid") int productid) {
        cartService.removeProductFromCart(cartid, productid);
        return ResponseEntity.ok("Ürün sepetten kaldırıldı.");
    }

    @PostMapping("/checkout/{id}")
    public ResponseEntity<String> checkoutCart(@PathVariable int id) {
        cartService.checkoutCart(id);
        return ResponseEntity.ok("Sepet onaylandı.");
    }
    @PostMapping("/reCheckout/{id}")
    public ResponseEntity<String> reCheckoutCart(@PathVariable int id) {
        cartService.reCheckoutCart(id);
        return ResponseEntity.ok("Sepet iptal edildi");
    }
}
