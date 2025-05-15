package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Areas3Controller {

    @GetMapping("/areas3")
    public String getAreas(Model model) {
       
        return "areas3";
    }
}