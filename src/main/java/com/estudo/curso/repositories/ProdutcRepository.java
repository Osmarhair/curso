package com.estudo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.curso.entidades.Product;

public interface ProdutcRepository extends JpaRepository<Product, Long> {

}
