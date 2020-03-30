package com.service;


import com.domain.Order;
import com.repository.OrderRepository;
import com.repository.OrderRepositoryImplementation;

import java.util.List;

public class OrderServiceImplementation implements OrderService {

    OrderRepository orderRepository = new OrderRepositoryImplementation();

    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    public void save(Order order) {
        if (order != null) {
            List<Order> orders = orderRepository.getAll();
            if (!orders.isEmpty()) {
                Order lastOrder = orders.get(orders.size() - 1);
                order.setId(lastOrder.getId() + 1);
                orderRepository.save(order);
            }
        }
    }

    public void delete(Order order) {
        if(order!=null){
            orderRepository.delete(order);
        }
    }

    public Order getById(Integer id) {
        if(id!=null){
            orderRepository.getById(id);
        }
        return null;
    }
}
