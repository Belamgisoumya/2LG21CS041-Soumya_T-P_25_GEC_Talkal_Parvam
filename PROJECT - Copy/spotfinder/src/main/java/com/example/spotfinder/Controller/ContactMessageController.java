package com.example.spotfinder.Controller;

// import java.util.concurrent.CompletionService;
import com.example.spotfinder.Service.ContactMessageService;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.spotfinder.Model.ContactMessage;

import org.springframework.ui.Model;

@Controller
public class ContactMessageController {
    @Autowired
    private ContactMessageService service;
    private CompletionService service;

    @GetMapping("/contact")
    public String contactForm(Model model) {
        model.addAttribute("contactMessage", new ContactMessage());
        return "contact/contact"; // this must match your contact.html file name in templates/
    }

    @PostMapping("/contact")
    public String submitForm(@ModelAttribute ContactMessage contactMessage, Model model) {
        Service.saveMessage(contactMessage);
        model.addAttribute("message", "Your message has been sent successfully!");
        return "contact";
    }
}
