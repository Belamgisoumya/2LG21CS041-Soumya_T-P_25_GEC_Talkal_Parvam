package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Slot2Controller {

    @GetMapping("/Booking-slot2")
    public String booking() {
        return "slot2";
    }
}
