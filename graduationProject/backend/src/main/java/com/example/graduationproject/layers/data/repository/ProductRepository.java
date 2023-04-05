package com.example.graduationproject.layers.data.repository;

import com.example.graduationproject.layers.data.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAllByCategoryCategoryIdOrderByProductNameAsc(int categoryId);

}
