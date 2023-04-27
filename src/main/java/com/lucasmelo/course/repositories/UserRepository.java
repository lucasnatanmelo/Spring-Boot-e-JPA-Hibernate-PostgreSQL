package com.lucasmelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmelo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
