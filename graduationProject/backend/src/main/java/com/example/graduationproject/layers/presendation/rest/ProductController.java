package com.example.graduationproject.layers.presendation.rest;

import com.example.graduationproject.layers.business.dto.ProductDto;
import com.example.graduationproject.layers.business.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {
    private ProductServiceImpl productService;
    ProductController(ProductServiceImpl productService){
        this.productService=productService;
    }
    @GetMapping("/{id}")
    public ProductDto getAccount(@PathVariable("id") int productId) {

        return productService.find(productId);
    }
    @GetMapping("")
    public List<ProductDto> findByCategoryIdOrderByProductNameAsc(@RequestParam int category_id) {
        return productService.findByCategoryIdOrderByProductNameAsc(category_id);
    }




}
