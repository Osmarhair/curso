package com.estudo.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.curso.entidades.Order;
import com.estudo.curso.services.OrderService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/Orders")
public class OrderResurse {
    
    @Autowired
    private OrderService service;
    
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
     
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@RequestParam Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    

}