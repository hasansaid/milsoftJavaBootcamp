package com.example.graduationproject.layers.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    private String customerName;
    private String cardNumber;
    @Enumerated(EnumType.STRING)
    private CartStatus cartStatus;


}


