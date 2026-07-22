package com.webservice.web.repositories;

import com.webservice.web.entities.Category;
import com.webservice.web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
