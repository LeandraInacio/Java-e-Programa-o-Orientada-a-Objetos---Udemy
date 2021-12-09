package com.cursojavaudemy.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaudemy.projeto1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
