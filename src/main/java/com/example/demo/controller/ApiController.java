package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CheckoutData;
import com.example.demo.entity.UserData;
import com.example.demo.repository.CheckRepository;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/sign")

// API Controller
public class ApiController {
	@Autowired
	UserRepository Us;

	@GetMapping("/users")
	public List<UserData> get() {
		return Us.findAll();
	}

	@GetMapping("/users/{id}")
	public Optional<UserData> getId(@PathVariable Integer id) {
		return Us.findById(id);
	}

	@Autowired
	CheckRepository Cr;

	@GetMapping("/check/{id}")
	public Optional<CheckoutData> gatadataId(@PathVariable Integer id) {
		return Cr.findById(id);
	}

	@GetMapping("/check")
	public List<CheckoutData> gatadata() {
		return Cr.findAll();
	}
}