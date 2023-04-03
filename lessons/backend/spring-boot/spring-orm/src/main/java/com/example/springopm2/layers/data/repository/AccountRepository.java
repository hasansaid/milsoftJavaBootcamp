package com.example.springopm2.layers.data.repository;

import com.example.springopm2.layers.data.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account,Long> {
}
