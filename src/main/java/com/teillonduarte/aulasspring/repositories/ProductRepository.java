package com.teillonduarte.aulasspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teillonduarte.aulasspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
 