package jedi.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FightDescController {
    @GetMapping("/fight")
    public String start(){
        return "fight";
    }
}
