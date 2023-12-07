package com.example.orderservice;

import service.Order;

import java.util.List;

public interface OrderService {

    public void addOrder(Order o);
    public Order getOrder(int id);
    public List<Order> getOrders();
    public void deleteOrder(int id);
    public void correctOrder(int id);


}
