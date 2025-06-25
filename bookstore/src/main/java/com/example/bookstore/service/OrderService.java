package com.example.bookstore.service;

import com.example.bookstore.model.Order;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getAllOrders();
}