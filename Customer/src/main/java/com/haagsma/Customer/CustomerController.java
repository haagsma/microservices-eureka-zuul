package com.haagsma.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public String getCustomer() {
        System.out.println("Passou aqui");
        return "First Name";
    }
    
}
