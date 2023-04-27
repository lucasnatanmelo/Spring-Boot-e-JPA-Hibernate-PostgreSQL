package com.lucasmelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmelo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
