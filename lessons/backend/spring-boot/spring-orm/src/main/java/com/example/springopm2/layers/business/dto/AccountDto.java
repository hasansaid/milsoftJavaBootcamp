package com.example.springopm2.layers.business.dto;

import lombok.Data;

@Data
public class AccountDto {
    private long accountId;
    private String accountName;
    private double amountLocal;
}
