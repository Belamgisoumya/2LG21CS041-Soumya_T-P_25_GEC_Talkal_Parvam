package com.example.spotfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Areas2Controller {

    @GetMapping("/areas2")
    public String getAreas(Model model) {
       
        return "areas2";
    }
}