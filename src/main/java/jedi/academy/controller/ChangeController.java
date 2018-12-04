package jedi.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChangeController {
    @GetMapping("/change")
    public String start() {
        return "change";
    }
}
