package com.example.spotfinder.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class RecoveryController {
    
    
    @GetMapping("/recover-password")
    public String showRecoveryForm() {
        return "Recovery_pwd"; // this assumes Thymeleaf or similar rendering, and Recovery_pwd.html is in templates
    }

    @PostMapping("/recover-password")
    @ResponseBody
    public ResponseEntity<String> handleRecovery(@RequestParam("identifier") String identifier) {
        // Here you would typically check if the user exists and send a recovery link
        System.out.println("Recovery requested for: " + identifier);

        // Simulate sending a recovery email or SMS
        boolean recoverySent = true; // Replace this with actual logic

        if (recoverySent) {
            return ResponseEntity.ok("Recovery link sent successfully.");
        } else {
            return ResponseEntity.badRequest().body("User not found or recovery failed.");
        }
    }
}