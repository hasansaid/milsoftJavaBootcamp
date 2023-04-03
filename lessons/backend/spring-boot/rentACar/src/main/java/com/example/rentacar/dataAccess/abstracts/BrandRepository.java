package com.example.rentacar.dataAccess.abstracts;

import com.example.rentacar.etities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
