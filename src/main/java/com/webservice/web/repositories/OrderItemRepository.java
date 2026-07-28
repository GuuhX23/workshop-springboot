package com.webservice.web.repositories;

import com.webservice.web.entities.OrderItem;
import com.webservice.web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
