package com.example.spotfinder.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ConfirmationArea2Controller {

     @GetMapping("/confirm-area2")
    public String confirmationarea2() {
        return "confirmationarea2"; // Spring Boot will resolve this to `index.html` in `resources/static`
    }
}