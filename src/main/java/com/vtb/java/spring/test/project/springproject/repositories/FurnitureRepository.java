package com.vtb.java.spring.test.project.springproject.repositories;

import com.vtb.java.spring.test.project.springproject.entities.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}
