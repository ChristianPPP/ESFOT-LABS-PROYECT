package esfot.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controladorWeb {
    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}