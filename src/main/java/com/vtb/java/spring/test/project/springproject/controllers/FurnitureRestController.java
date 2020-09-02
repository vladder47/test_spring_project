package com.vtb.java.spring.test.project.springproject.controllers;

import com.vtb.java.spring.test.project.springproject.entities.Furniture;
import com.vtb.java.spring.test.project.springproject.exceptions.ResourceNotFoundException;
import com.vtb.java.spring.test.project.springproject.services.FurnitureService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/furniture")
public class FurnitureRestController {
    private FurnitureService furnitureService;

    @GetMapping
    public List<Furniture> getAllFurniture() {
        return furnitureService.findAll();
    }

    @GetMapping("/{id}")
    public Furniture getFurnitureById(@PathVariable Long id) {
        return furnitureService.findById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Furniture createNewFurniture(@RequestBody Furniture furniture) {
        if (furniture.getId() != null) {
            furniture.setId(null);
        }
        return furnitureService.saveOrUpdate(furniture);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    public Furniture updateFurniture(@RequestBody Furniture furniture) {
        if (!furnitureService.existsById(furniture.getId())) {
            throw new ResourceNotFoundException(String.format("Товар с id = %d не найден", furniture.getId()));
        }
        return furnitureService.saveOrUpdate(furniture);
    }

    @DeleteMapping("/{id}")
    public void deleteFurnitureById(@PathVariable Long id) {
        furnitureService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllFurniture() {
        furnitureService.deleteAll();
    }
}
