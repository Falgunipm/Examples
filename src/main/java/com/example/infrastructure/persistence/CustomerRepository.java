package com.example.infrastructure.persistence;

import com.example.domain.Customer;
import com.example.domain.CustomerId;
import com.example.domain.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CustomerRepository implements ICustomerRepository {
    private List<Customer> customerList = new ArrayList();

    @Override
    public Long generateId() {
        Random random = new Random(2);
        return random.nextLong();
    }

    @Override
    public CustomerId save(Customer customer) {
        customerList.add(customer);
        return customer.getId();
    }
}
