package com.example.springopm2.layers.business.service;

import com.example.springopm2.layers.business.dto.AccountDto;
import com.example.springopm2.layers.data.entity.Account;
import com.example.springopm2.layers.data.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;
    AccountServiceImpl(AccountRepository accountRepository)
    {
        this.accountRepository=accountRepository;
    }
    @Override
    public void add(AccountDto accountDto) {
    Account account = toEntity(accountDto);
    accountRepository.save(account);
    }

    @Override
    public void change(AccountDto accountDto) {
    Account account = toEntity(accountDto);
        accountRepository.save(account);

    }

    @Override
    public void delete(long accountId) {

        accountRepository.deleteById(accountId);
    }

    @Override
    public AccountDto find(long accountId) {
        Optional<Account> optional = accountRepository.findById(accountId);
        if(optional.isPresent()){
            return toDto(optional.get());
        }
        return null;
    }

    @Override
    public List<AccountDto> list() {
        List<AccountDto> accountDtoList = new ArrayList<>();
        for (Account account:accountRepository.findAll()
             ) {
            AccountDto accountDto = toDto(account);
            accountDtoList.add(toDto(account));
        }
        return accountDtoList;
    }
    public Account toEntity(AccountDto accountDto){
        Account account = new Account();
        account.setAccountId(accountDto.getAccountId());
        account.setAccountName(accountDto.getAccountName());
        account.setAmountLocal(accountDto.getAmountLocal());

        return account;
    }
    public AccountDto toDto(Account account){
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountId(account.getAccountId());
        accountDto.setAccountName(account.getAccountName());
        accountDto.setAmountLocal(account.getAmountLocal());

        return accountDto;
    }
}
