package com.springboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot3jpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
