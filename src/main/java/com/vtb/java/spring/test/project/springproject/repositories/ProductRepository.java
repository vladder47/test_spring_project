package com.vtb.java.spring.test.project.springproject.repositories;

import com.vtb.java.spring.test.project.springproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
