package com.example.springinit.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.springinit.login.dto.LoginDTO;
import com.example.springinit.order.dto.OrderDTO;
import com.example.springinit.order.entity.Order;
import com.example.springinit.order.service.impl.OrderService;
import com.example.springinit.orderresponses.OrderResponse;
import com.example.springinit.response.LoginResponse;

@RestController
@CrossOrigin(origins="http://localhost:3000/")
@RequestMapping("/orderreceived")

public class OrderController {
	@Autowired
	private OrderService orderService;
	@PostMapping(path="/saveOrder")
	
	public int saveOrder(@RequestBody OrderDTO dto)
	{
		int id= orderService.addOrder(dto);
		return id;
	}
	
	/*@GetMapping (path = "/retrieveOrder")
	public ResponseEntity<?>getOrder(@RequestBody OrderDTO orderDTO)
	{
		OrderResponse orderResponse = orderService.getorder(orderDTO);
		return ResponseEntity.ok(orderResponse);
	}*/
	@GetMapping (path = "/checkOrder")
	public ResponseEntity<?>checkOrder(@RequestParam int orderId)
	{
		OrderResponse orderResponse = orderService.displayOrder(orderId);
	return ResponseEntity.ok(orderResponse);
}
	@GetMapping (path = "/getAllOrders")
	public ResponseEntity<?>getAllOrders()
	{
		List<Order> orderResponse = orderService.displayAllOrder();
	return ResponseEntity.ok(orderResponse);
}

}
