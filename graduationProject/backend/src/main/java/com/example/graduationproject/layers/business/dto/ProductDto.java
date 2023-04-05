package com.example.graduationproject.layers.business.dto;

import com.example.graduationproject.layers.data.entity.Category;
import lombok.Data;

@Data
public class ProductDto {
    private int productId;
    private String productName;
    private double salesPrice;
    private CategoryDto category;

}
