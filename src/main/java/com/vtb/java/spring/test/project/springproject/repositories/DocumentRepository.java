package com.vtb.java.spring.test.project.springproject.repositories;

import com.vtb.java.spring.test.project.springproject.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
