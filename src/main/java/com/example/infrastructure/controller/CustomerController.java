package com.example.application;

import com.example.domain.CustomerId;
import com.example.domain.CustomerRequest;
import com.example.domain.ICustomerCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "customer")
@EnableAutoConfiguration
public class CustomerController {
    private final ICustomerCreator customerCreator;

    @PostMapping(value = "save", consumes = "application/json", produces = "application/json")
    public CustomerId save(@RequestBody CustomerRequest customerRequest) {
        return customerCreator.save(customerRequest);
    }
}
