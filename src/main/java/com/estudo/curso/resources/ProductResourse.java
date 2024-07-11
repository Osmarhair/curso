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
public class ProductResourse {
    
    @Autowired
    private ProductService service;
    
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
     
        @SuppressWarnings("unchecked")
        List<Product> list = (List<Product>) service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponseEntity<Product>> findById(@RequestParam Long id) {
        ResponseEntity<Product> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    

}