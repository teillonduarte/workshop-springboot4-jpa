package com.teillonduarte.aulasspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teillonduarte.aulasspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
 