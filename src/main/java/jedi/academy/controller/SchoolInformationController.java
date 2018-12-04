package jedi.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SchoolInformationController {
    @GetMapping("/info")
    public String start(){
        return "schoolInformation";
    }
}
