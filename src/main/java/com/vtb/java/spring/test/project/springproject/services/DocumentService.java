package com.vtb.java.spring.test.project.springproject.services;

import com.vtb.java.spring.test.project.springproject.entities.Document;
import com.vtb.java.spring.test.project.springproject.exceptions.ResourceNotFoundException;
import com.vtb.java.spring.test.project.springproject.repositories.DocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DocumentService {
    private DocumentRepository documentRepository;

    public Document findById(Long id){
        return documentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Документа с таким id отсутствует в базе данных"));
    }

    public List<Document> findAll(){
        return documentRepository.findAll();
    }

    public Document saveOrUpdate(Document document){
        return documentRepository.save(document);
    }

    public void deleteById(Long id){
        documentRepository.deleteById(id);
    }

    public void deleteAll(){
        documentRepository.deleteAll();
    }

    public boolean existsById(Long id){
        return documentRepository.existsById(id);
    }

}
