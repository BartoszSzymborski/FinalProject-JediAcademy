package jedi.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JediForce {
    @GetMapping("/jediForce")
    public String start(){
        return "jediForce";
    }
}
