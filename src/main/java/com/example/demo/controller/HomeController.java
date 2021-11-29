package com.example.demo.controller;

import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.CheckoutData;
import com.example.demo.entity.UserData;
import com.example.demo.repository.CheckRepository;
import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.UserRepository;



@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@GetMapping("/plants")
	public String plants()
	{
		return "plants";
	}

	@GetMapping("/products")
	public String products()
	{
		return "products";
	}

	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	@GetMapping("/pay")
	public String pay()
	{
		return "pay";
	}
	
	@GetMapping("/*")
	public String ok()
	{
		return "404er";
	}
	
	@GetMapping("/checkoutpage")
	public String ofk()
	{
		return "404er";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	@PostMapping("/checkoutnote")
	public String checkoutnote(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/checkoutnote";
	}
	
/*
 * @PostMapping("/pay") public String pay(@ModelAttribute PaymentData p,
 * HttpSession session) { System.out.println(p);
 * 
 * check.save(p); session.setAttribute("message", "User Register Successfully");
 * 
 * return "redirect:/checkoutnote"; }
 * 
 * @PostMapping("/contact") public String contact(@ModelAttribute ContactData u,
 * HttpSession session) { con.save(u); session.setAttribute("message",
 * "User Register Successfully");
 * 
 * 
 * return "redirect:/home"; }
 */
 }
