package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserData;
import com.example.demo.repository.UserRepository;


@RestController
@RequestMapping("/sign")

public class ApiController {
@Autowired
UserRepository ss;
@GetMapping("/users")
public List<UserData>get(){
return ss.findAll();
}

   
}