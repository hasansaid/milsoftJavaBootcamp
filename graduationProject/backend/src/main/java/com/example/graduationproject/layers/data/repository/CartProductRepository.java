package com.example.graduationproject.layers.data.repository;

import com.example.graduationproject.layers.data.entity.Cart;
import com.example.graduationproject.layers.data.entity.CartProduct;
import com.example.graduationproject.layers.data.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartProductRepository extends CrudRepository<CartProduct, Integer> {
    List<CartProduct> findByCart_CartId(int cartId);

    Optional<CartProduct> findByCart_CartIdAndProduct_ProductId(int cartId, int productId);
}
