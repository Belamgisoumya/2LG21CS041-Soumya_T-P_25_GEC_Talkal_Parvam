package com.example.spotfinder.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spotfinder.Model.Confirmation;
import com.example.spotfinder.Service.ConfirmationService;



@Controller
public class ConfirmationArea2Controller {

     @GetMapping("/confirm-area2")
    public String confirmationarea2() {
        return "confirmationarea2/confirmationarea2"; // Spring Boot will resolve this to `index.html` in `resources/static`
    }
     @Autowired
    private ConfirmationService confirmationService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("confirmation", confirmationService.listAll());
        return "confirmation/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("confirmation", new Confirmation());
        return "confirmation/create";
    }

    @PostMapping("/save2")
    public String saveConfirmation(@ModelAttribute Confirmation con) {
        confirmationService.saveConfirmation(con);
        return "redirect:/soumya/list";
    }
     @GetMapping("/delete/{id}")
    public String deleteConfirmation(@PathVariable Long id) {
        confirmationService.deleteConfirmation(id);
        return "redirect:/Soumya/list";
    }
}
