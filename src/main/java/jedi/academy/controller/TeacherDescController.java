package jedi.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherDescController {
    @GetMapping("/teacherDesc")
    public String start(){
        return "teacherDesc";
    }
}
