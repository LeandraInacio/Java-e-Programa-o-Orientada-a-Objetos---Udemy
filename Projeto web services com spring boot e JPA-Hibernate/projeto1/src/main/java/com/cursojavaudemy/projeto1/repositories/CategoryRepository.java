package com.cursojavaudemy.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaudemy.projeto1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
