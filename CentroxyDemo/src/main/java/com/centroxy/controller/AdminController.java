
package com.centroxy.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.centroxy.model.UserDtls;
import com.centroxy.service.UserService;

@Controller

@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private UserService userService;


	@GetMapping("/")
	public String home() {
		return "admin/home";
	}
	
	
 
	
	/*
	 * @PostMapping("/adminCreateUser") public String createUser(@ModelAttribute
	 * UserDtls user, HttpSession session) {
	 * 
	 * boolean f = userService.checkEmail(user.getEmail());
	 * 
	 * if (f) { session.setAttribute("msg", "Email Id Already Exist.."); } else {
	 * 
	 * UserDtls userDtls = userService.createUser(user);
	 * 
	 * if (userDtls != null) { session.setAttribute("msg", "Register Successfully");
	 * } else { session.setAttribute("msg", "Something went wrong on server...!!");
	 * }
	 * 
	 * }
	 * 
	 * return "redirect:/admin/"; }
	 */
	
	
	
	
	
	
	
	@PostMapping("/adminCreateUser")
	public String createUser(@ModelAttribute UserDtls user, @RequestParam("imageFile") MultipartFile imageFile,
			HttpSession session) throws IOException {
		boolean f = userService.checkEmail(user.getEmail());

		if (f) {
			session.setAttribute("msg", "Email Id Already Exist..");
		} else {
			if (!imageFile.isEmpty()) {
				user.setImage(imageFile.getBytes());
			}

			UserDtls userDtls = userService.createUser(user);

			if (userDtls != null) {
				session.setAttribute("msg", "Register Successfully");
			} else {
				session.setAttribute("msg", "Something went wrong on server...!!");
			}
		}

		 return "redirect:/admin/";
	}
}
