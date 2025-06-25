package com.example.bookstore.service;

import com.example.bookstore.model.Customer;
import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
