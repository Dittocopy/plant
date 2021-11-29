package com.example.demo.repository;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;

import org.springframework.beans.factory.annotation.Autowired;
 

 
 
 
@Service
public class LoginService {
@Autowired
private loginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
   return user;
  }
 
}
