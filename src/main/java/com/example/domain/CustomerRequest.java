package com.example.domain;

import lombok.Data;

@Data
public class CustomerRequest {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;


}
