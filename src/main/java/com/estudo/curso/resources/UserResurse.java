package com.estudo.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.curso.entidades.User;

@RestController
@RequestMapping(value = "/users")
public class UserResurse {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Osmar", "osmar@Osmar.com", "999666333", "123456");
        return ResponseEntity.ok().body(u);
    }

}
