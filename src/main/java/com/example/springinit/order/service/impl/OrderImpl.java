package com.example.springinit.order.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.example.springinit.login.service.UserService;
import com.example.springinit.order.dto.OrderDTO;
import com.example.springinit.order.entity.Order;
import com.example.springinit.order.repo.OrderRepo;
import com.example.springinit.orderresponses.OrderResponse;

@Service
public class OrderImpl implements OrderService{

	@Autowired
	private OrderRepo orderRepo;

	@Override
	public int addOrder(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		Order order = new Order(
				orderDTO.getsNo(),
				orderDTO.getOrderId(),
				orderDTO.getRetailerName(),
				orderDTO.getUnits(),
				orderDTO.getAmount()
				);
		orderRepo.save(order);
		return order.getOrderId();
	} 

	@Override
	public OrderResponse displayOrder(int orderId) 
	{
		Order order = orderRepo.findByOrderId(orderId);
		if (order != null) 
		{
			// Perform necessary operations or transformations on the order object

			// Create and return an OrderResponse object with the order details
			return new OrderResponse(order.toString(), true);
		} 

		else 

		{
			// Handle the case when the order is not found
			return new OrderResponse("Order not found", false);
		}

	}

	@Override
	public List<Order> displayAllOrder() 
	{
		List<Order> order = orderRepo.findAll();
		if (order != null) 
		{
			// Perform necessary operations or transformations on the order object

			// Create and return an OrderResponse object with the order details
			return order;
			//return new OrderResponse(order.toString(), true);
		} 

		return null;
	}

}
