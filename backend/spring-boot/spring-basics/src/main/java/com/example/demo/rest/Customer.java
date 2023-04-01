package com.example.demo.rest;

public class Customer {
    private long CustomerId;
    private String customerName;
    private double totalDebit;

    Customer(){};

    public Customer(long customerId, String customerName, double totalDebit) {
        CustomerId = customerId;
        this.customerName = customerName;
        this.totalDebit = totalDebit;
    }

    public long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }
}
