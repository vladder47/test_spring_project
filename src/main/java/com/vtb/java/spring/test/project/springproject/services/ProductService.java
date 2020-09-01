package com.vtb.java.spring.test.project.springproject.services;

import com.vtb.java.spring.test.project.springproject.entities.Product;
import com.vtb.java.spring.test.project.springproject.exceptions.ResourceNotFoundException;
import com.vtb.java.spring.test.project.springproject.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Товар с таким id отсутствует в базе данных"));
    }

    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }

    public boolean existsById(Long id) {
        return productRepository.existsById(id);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public void deleteAllProducts() {
        productRepository.deleteAll();
    }
}
