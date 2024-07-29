package com.otabek.ecommerce.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request) {
        if (request == null) {
            return null;
        }
        return Customer.builder()
                .id(request.id())
                .firstName(request.id())
                .lastName(request.firstName())
                .email(request.lastName())
                .address(request.address())
                .build();
    }
}
