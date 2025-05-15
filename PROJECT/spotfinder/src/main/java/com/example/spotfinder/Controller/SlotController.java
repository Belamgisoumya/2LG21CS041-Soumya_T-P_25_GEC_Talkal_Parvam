package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SlotController {

    @GetMapping("/Booking")
    public String booking() {
        return "slot";
    }
}
