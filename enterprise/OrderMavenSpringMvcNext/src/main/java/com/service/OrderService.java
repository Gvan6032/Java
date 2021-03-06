package com.service;

import com.domain.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAll();
    void save(Order order);
    void delete (Order order);
    Order getById(Integer id);
}