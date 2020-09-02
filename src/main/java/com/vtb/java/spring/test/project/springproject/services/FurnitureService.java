package com.vtb.java.spring.test.project.springproject.services;

import com.vtb.java.spring.test.project.springproject.entities.Furniture;
import com.vtb.java.spring.test.project.springproject.exceptions.ResourceNotFoundException;
import com.vtb.java.spring.test.project.springproject.repositories.FurnitureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FurnitureService {
    private FurnitureRepository furnitureRepository;

    public Furniture findById(Long id){
        return furnitureRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Мебель с таким id отсутствует в базе данных"));
    }

    public List<Furniture> findAll(){
        return furnitureRepository.findAll();
    }

    public Furniture saveOrUpdate(Furniture furniture){
        return furnitureRepository.save(furniture);
    }

    public void deleteById(Long id){
        furnitureRepository.deleteById(id);
    }

    public void deleteAll(){
        furnitureRepository.deleteAll();
    }

    public boolean existsById(Long id){
        return furnitureRepository.existsById(id);
    }
}
