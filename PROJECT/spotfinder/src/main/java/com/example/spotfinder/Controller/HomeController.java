package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @GetMapping("/service")
    public String servicePage() {
        return "service";
    }

    @GetMapping("/admin")
    public String adminLoginPage() {
        return "admin";
    }

    @GetMapping("/employee")
    public String employeeLoginPage() {
        return "employee";
    }

    @GetMapping("/booking")
    public String bookingPage() {
        return "booking";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }
}
