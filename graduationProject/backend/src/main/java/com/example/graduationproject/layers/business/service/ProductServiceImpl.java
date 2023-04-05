package com.example.graduationproject.layers.business.service;

import com.example.graduationproject.layers.business.dto.CategoryDto;
import com.example.graduationproject.layers.business.dto.ProductDto;
import com.example.graduationproject.layers.core.utilities.mappers.ModelMapperServiceImpl;
import com.example.graduationproject.layers.data.entity.Category;
import com.example.graduationproject.layers.data.entity.Product;
import com.example.graduationproject.layers.data.repository.ProductRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;
    private ModelMapperServiceImpl modelMapperService;

    ProductServiceImpl(ProductRepository productRepository, ModelMapperServiceImpl modelMapperService){
        this.productRepository=productRepository;
        this.modelMapperService=modelMapperService;

    }

    @Override
    public ProductDto find(int id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            ProductDto productDto = modelMapperService.forResponse().map(product, ProductDto.class);

            return productDto;
        }
        return null;
    }
    public List<ProductDto> findByCategoryIdOrderByProductNameAsc(int categoryId) {
        List<Product> productList = productRepository.findAllByCategoryCategoryIdOrderByProductNameAsc(categoryId);
        return productList.stream()
                .map(product -> modelMapperService.forResponse().map(product, ProductDto.class))
                .collect(Collectors.toList());
    }


    /*public ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setSalesPrice(product.getSalesPrice());
        productDto.setCategory(product.getCategory());
        return productDto;
    }

    public Product toEntity(ProductDto productDto){
        Product product = new Product();
        product.setProductId(productDto.getProductId());
        product.setProductName(productDto.getProductName());
        product.setSalesPrice(productDto.getSalesPrice());
        product.setCategory(productDto.getCategory());
        return product;
    }*/
}
