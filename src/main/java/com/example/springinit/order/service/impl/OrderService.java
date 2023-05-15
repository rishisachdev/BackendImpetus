package com.example.springinit.order.service.impl;
import java.util.List;

import com.example.springinit.order.dto.OrderDTO;
import com.example.springinit.order.entity.Order;
import com.example.springinit.orderresponses.OrderResponse;

public interface OrderService {
	int addOrder(OrderDTO dtO);
	OrderResponse displayOrder(int orderId);
	List<Order> displayAllOrder();
}