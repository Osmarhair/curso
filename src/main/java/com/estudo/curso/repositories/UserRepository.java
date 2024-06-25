package com.estudo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.curso.entidades.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
