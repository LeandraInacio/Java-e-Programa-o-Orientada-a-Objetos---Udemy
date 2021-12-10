package com.cursojavaudemy.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaudemy.projeto1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
