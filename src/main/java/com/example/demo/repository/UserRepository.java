package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserData;



public interface UserRepository extends JpaRepository<UserData, Integer>{

}
