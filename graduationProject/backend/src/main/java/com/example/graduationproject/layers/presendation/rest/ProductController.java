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


    /*@GetMapping("/add/{id}")
    public String addProduct(@PathVariable("id") int categoryId){

        Product product = new Product();
        product.setProductName("Kareli Defter");
        product.setSalesPrice(30);

        Optional<Category> optional = categoryRepository.findById(categoryId);
        if(optional.isPresent()){
            Category category = optional.get();
            product.setCategory(category);
            productRepository.save(product);
            return "Çalışan ismi : " + product.getProductName() + " Çalıştığı Departman : " +product.getCategory().getCategoryName();
        }

        return "Eklenemedi";
    }*/


}
