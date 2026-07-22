package com.webservice.web.repositories;

import com.webservice.web.entities.Category;
import com.webservice.web.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
