package com.example.springinit.order.repo;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.springinit.order.entity.Order;

@EnableJpaRepositories
@Repository

public interface OrderRepo extends JpaRepository<Order,Integer>{

		 //Optional<Order> findOneOrderId(int orderId);
		//Order findByOrderId(int orderId);
}
