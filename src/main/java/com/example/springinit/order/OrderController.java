package com.example.springinit.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import com.example.springinit.order.dto.OrderDTO;
import com.example.springinit.order.service.impl.OrderService;

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
}
