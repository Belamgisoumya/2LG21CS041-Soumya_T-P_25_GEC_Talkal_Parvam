package com.example.spotfinder.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SignupController {

     @GetMapping("/sign")
    public String signup() {
        return "signup"; // Spring Boot will resolve this to `index.html` in `resources/static`
    }
}