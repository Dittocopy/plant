package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.CheckoutData;

public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}
