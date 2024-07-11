package com.estudo.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.curso.entidades.Category;
import com.estudo.curso.services.CategoryService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/Categories")
public class CategoryResourse {
    
    @Autowired
    private CategoryService service;
    
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
     
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@RequestParam Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    

}
