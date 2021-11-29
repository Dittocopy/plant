package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Login;

public interface loginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}
