package com.example.graduationproject.layers.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private double salesPrice;
    private String image;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
