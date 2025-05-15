package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/login")
    public String showEmployeeLoginPage() {
        return "login"; // make sure your HTML file is named admin-login.html inside the templates folder
    }
}

