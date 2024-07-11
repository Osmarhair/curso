package com.estudo.curso.resources;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.curso.entidades.Product;



@RestController
@RequestMapping(value = "/Products")
public class ProductService {
    
    @Autowired
    private Product service;
    
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
     
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@RequestParam Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    

}