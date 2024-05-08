
package com.centroxy.controller;
/*
 * 
 * 
 * import java.security.Principal;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import com.centroxy.model.UserDtls; import
 * com.centroxy.repository.UserRepository;
 * 
 * @Controller
 * 
 * @RequestMapping("/user/") public class UserController {
 * 
 * @Autowired private UserRepository userRepo;
 * 
 * @GetMapping("/") public String home() { return "user/home"; }
 * 
 * 
 * 
 * @ModelAttribute private void userDetails(Model m, Principal p) { String email
 * = p.getName(); UserDtls user = userRepo.findByEmail(email);
 * 
 * m.addAttribute("user", user);
 * 
 * }
 * 
 * }
 */






 

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.centroxy.model.UserDtls;
import com.centroxy.repository.UserRepository;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserRepository userRepo;
    
    @GetMapping("/")
    public String home(Model model, Principal principal) {
        String email = principal.getName();
        UserDtls user = userRepo.findByEmail(email);
        model.addAttribute("user", user);
        return "user/home";
    }
}
