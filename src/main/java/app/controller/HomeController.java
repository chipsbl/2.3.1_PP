package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/users/";
    }
}
