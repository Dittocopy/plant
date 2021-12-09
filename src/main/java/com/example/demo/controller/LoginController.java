package com.example.demo.controller;

import java.util.List;
import java.util.Objects;





import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Login;
import com.example.demo.loginservices.LoginService;
import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.loginRepository;


@Controller
public class LoginController {
	@Autowired
	private ContactRepository con;
	@Autowired
    private LoginService userService;
	@Autowired
 	private loginRepository eRepo;
	
	@GetMapping("/login")
	public ModelAndView login() {
	     ModelAndView mav = new ModelAndView("login");
	        mav.addObject("user", new Login());
	        return mav;
	    }
	
	@PostMapping("/login")
    public String login(@ModelAttribute("user") Login user, RedirectAttributes redirAttrs ) {
    
     Login oauthUser = userService.login(user.getEmail(), user.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/homelogin";
    
    
     } else {
    	 redirAttrs.addFlashAttribute("error", "Invalid Username or Password if not have account go to sign in.");
         return "redirect:/login";
    
    
     }
 
}
}

     
