package com.estudo.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.curso.entidades.Product;

@Service
public class ProductService {

    @Autowired
    private ProductService Service;

    public List<Product> findAll() {
        return Service.findAll(); 
    }

    public Product findById(long id) {
        Optional<Product> obj = Optional.ofNullable(Service.findById(id));
        return obj.get();
    }
}