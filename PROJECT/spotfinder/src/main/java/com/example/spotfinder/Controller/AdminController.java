package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/login")
    public String showAdminLoginPage() {
        return "admin/admin"; // make sure your HTML file is named admin-login.html inside the templates folder
    }
    
    
}
