package jedi.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaberDescController {
    @GetMapping("/saber")
    public String start(){
        return "saber";
    }
}
