package com.example.spotfinder.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ConfirmationArea3Controller {

     @GetMapping("/confirm-area3")
    public String confirmationarea3() {
        return "confirmationarea3"; // Spring Boot will resolve this to `index.html` in `resources/static`
    }
}