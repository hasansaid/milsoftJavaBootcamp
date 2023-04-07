package com.example.graduationproject.layers.data.repository;

import com.example.graduationproject.layers.data.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    Optional<Cart> findByCartId(Integer cartId);
}
