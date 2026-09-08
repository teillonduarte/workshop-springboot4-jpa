package com.teillonduarte.aulasspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teillonduarte.aulasspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
 