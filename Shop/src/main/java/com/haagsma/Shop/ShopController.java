package com.haagsma.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShopController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/info")
    public String getInfo() {
        String customer = restTemplate.getForObject("http://customer-service/customer", String.class);
        String product = restTemplate.getForObject("http://product-service/product", String.class);
        return "Product: " + product + " - Customer: " + customer;
    }
    
}
