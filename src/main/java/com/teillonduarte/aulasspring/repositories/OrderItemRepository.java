package com.teillonduarte.aulasspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teillonduarte.aulasspring.entities.OrderItem;
import com.teillonduarte.aulasspring.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
 