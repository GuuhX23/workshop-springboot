package com.webservice.web.repositories;

import com.webservice.web.entities.Order;
import com.webservice.web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
