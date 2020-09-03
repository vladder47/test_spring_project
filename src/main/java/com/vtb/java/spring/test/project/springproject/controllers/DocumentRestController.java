package com.vtb.java.spring.test.project.springproject.controllers;

import com.vtb.java.spring.test.project.springproject.entities.Document;
import com.vtb.java.spring.test.project.springproject.exceptions.ResourceNotFoundException;
import com.vtb.java.spring.test.project.springproject.services.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/document")
public class DocumentRestController {
    private DocumentService documentService;

    @GetMapping
    public List<Document> getAllDocument() {
        return documentService.findAll();
    }

    @GetMapping("/{id}")
    public Document getDocumentById(@PathVariable Long id) {
        return documentService.findById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Document createNewDocument(@RequestBody Document document) {
        if (document.getId() != null) {
            document.setId(null);
        }
        return documentService.saveOrUpdate(document);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    public Document updateDocument(@RequestBody Document document) {
        if (!documentService.existsById(document.getId())) {
            throw new ResourceNotFoundException(String.format("Документ с id = %d не найден", document.getId()));
        }
        return documentService.saveOrUpdate(document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentById(@PathVariable Long id) {
        documentService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllDocument() {
        documentService.deleteAll();
    }
}
