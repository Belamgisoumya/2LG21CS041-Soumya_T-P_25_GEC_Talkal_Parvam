package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AreaController {

    @GetMapping("/areas")
    public String getAreas(Model model) {
       
        return "areas";
    }
}