package com.example.springopm2.layers.business.service;

import com.example.springopm2.layers.business.dto.AccountDto;
import com.example.springopm2.layers.data.entity.Account;
import java.util.List;
import org.springframework.stereotype.Service;


public interface AccountService {
    void add(AccountDto accountDto);
    void change(AccountDto accountDto);
    void delete(long accountId);
    AccountDto find(long accountId);
    List<AccountDto> list();
}
