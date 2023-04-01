package com.example.springclient;
import java.util.*;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/client")
public class CustomerClient {

    @GetMapping("/customer")
    @ResponseBody // view gelmesini engeller
    public String getCustomer() {
        long customerId = 603;
        String url = "http://localhost:8080/customer/find/" + customerId;
        RestTemplate restTemplate = new RestTemplate();
        // Kısa yöntem..
        // Customer customer= restTemplate.getForObject(url, Customer.class);

        // Uzun yöntem..
        ResponseEntity<Customer> response = restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, Customer.class);
        Customer customer = response.getBody();
        return "Alımcı Adı: " + customer.getCustomerName() + " -- ID:" + customer.getCustomerId();
    }

    @GetMapping("/customers")
    @ResponseBody // view gelmesini engeller
    public String getCustomers() {
        String url = "http://localhost:8080/customer/list";
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Customer>> response =
                restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<Customer>>() {

                });
        List<Customer> customers = response.getBody();
        for (Customer customer:customers
             ) {
            System.out.println(customer);
        }
        return "Alımcı sayısı: " + customers.size();
    }

    @GetMapping("/customer/add")
    @ResponseBody // view gelmesini engeller
    public String addCustomer() {
        String url = "http://localhost:8080/customer/create";
        RestTemplate restTemplate = new RestTemplate();
        Customer customer = new Customer(0,"Erdoğan Berker",54660);
        Long customerId =restTemplate.postForObject(url,customer,Long.class);
        return "Alıncı Özdeiliği: "+customerId;
    }
}
