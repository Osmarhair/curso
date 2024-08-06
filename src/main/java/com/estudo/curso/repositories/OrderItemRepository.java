package com.estudo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.curso.entidades.OrderItem;
import com.estudo.curso.entidades.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
