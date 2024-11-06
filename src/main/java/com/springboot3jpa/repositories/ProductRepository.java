package com.springboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot3jpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
