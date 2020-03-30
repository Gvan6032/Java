package com.repository;

import com.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImplementation implements OrderRepository {

    private List<Order> orders = new ArrayList<Order>();

    public OrderRepositoryImplementation(){
        Order order = new Order();
    }
    public List<Order> getAll() {
        return orders;
    }

    public void save(Order order) {
        orders.add(order);
    }

    public void delete(Order order) {
        orders.remove(order);
    }

    public Order getById(Integer id) {
        return orders.get(id);
    }
}