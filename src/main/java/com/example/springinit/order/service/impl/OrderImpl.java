package com.example.springinit.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.example.springinit.login.service.UserService;
import com.example.springinit.order.dto.OrderDTO;
import com.example.springinit.order.entity.Order;
import com.example.springinit.order.repo.OrderRepo;
	
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
	}
