package com.example.springopm2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SupplierRepository extends CrudRepository<Supplier,Long> {

    @Query("select s from Supplier s where s.totalCredit>= :totalCreditMin")
    public Iterable<Supplier> findByTotalCreditMin(@Param("totalCreditMin") double totalCreditMin);

    // Drived Query (Ek kısım)
}
