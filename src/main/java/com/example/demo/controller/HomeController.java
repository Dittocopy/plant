package com.example.demo.controller;

import javax.servlet.http.HttpSession;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.CheckoutData;
import com.example.demo.entity.ContactData;
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
	public String home1()
	{
		return "home1";
	}
	
	@GetMapping("/homelogin")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/aboutlogin")
	public String aboutlogin()
	{
		return "about1";
	}
	
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	@GetMapping("/products")
	public String products()
	{
		return "products";
	}
	
	@GetMapping("/plants")
	public String plants()
	{
		return "plants";
	}
	
	@GetMapping("/about")
	public String aboutus()
	{
		return "about";
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
	
	@GetMapping("/checkoutpage")
	public String checkoutpage()
	{
		return "checkoutnote";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData c, HttpSession session)
	{
		System.out.println(c);
		con.save(c);
		
		return "/home";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/signup";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		
		
		return "redirect:/checkoutnote";
	}
	
	
	
}
