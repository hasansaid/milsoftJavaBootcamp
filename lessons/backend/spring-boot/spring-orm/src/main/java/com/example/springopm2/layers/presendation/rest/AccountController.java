package com.example.springopm2.layers.presendation.rest;

import com.example.springopm2.layers.business.dto.AccountDto;
import com.example.springopm2.layers.business.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/add")
    public long addAccount(@RequestBody AccountDto accountDto) {
        accountService.add(accountDto);
        return accountDto.getAccountId();
    }

    @PutMapping("/update")
    public void updateAccount(@RequestBody AccountDto accountDto) {
        accountService.change(accountDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable("id") long accountId) {
        accountService.delete(accountId);
    }

    @GetMapping("/get/{id}")
    public AccountDto getAccount(@PathVariable("id") long accountId) {
        return accountService.find(accountId);
    }

    @GetMapping("/list")
    public List<AccountDto> getAccounts(long accountId) {
        return accountService.list();
    }
}
