package com.lucasmelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmelo.course.entities.OrderItem;
import com.lucasmelo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
