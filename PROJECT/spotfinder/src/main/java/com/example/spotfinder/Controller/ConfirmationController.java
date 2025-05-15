package com.example.spotfinder.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.example.spotfinder.Model.Confirmation;
import com.example.spotfinder.Service.ConfirmationService;



@Controller
@RequestMapping("/soumya")
public class ConfirmationController {


     @GetMapping("/confirm")
    public String confirmation( Model model) {
        model.addAttribute("confirmation", new Confirmation());
        return "confirmation/confirmation"; 
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

    @PostMapping("/save")
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