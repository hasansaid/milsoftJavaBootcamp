package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/find/{id}")
    public Customer getCustomer(@PathVariable("id") long customerId){
        Customer customer = new Customer(customerId,"Yıldırım Gürses",65750);
        return customer;
    }

    @GetMapping("/list")
    public List<Customer> getCustomers(){
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(601,"Yıldırım Gürses",65750));
        customerList.add(new Customer(602,"Erhan Gürses",87600));
        customerList.add(new Customer(603,"Şimşek Gürses",34865));
        customerList.add(new Customer(604,"Faruk Gürses",9586));
        return customerList;
    }
    @PostMapping("/create")
    public long createCustomer(@RequestBody Customer customer){
        System.out.println("Ekleniyor" + customer.getCustomerName());
        customer.setCustomerId(605);
        return customer.getCustomerId();
    }
}
