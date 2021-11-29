package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ContactData;


public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}
