package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Slot3Controller {

    @GetMapping("/Booking-slot3")
    public String booking() {
        return "slot3";
    }
}
