package jedi.academy.controller;

import jedi.academy.entity.School;
import jedi.academy.entity.Student;
import jedi.academy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AllChoose {
    @Autowired
    private StudentService studentService;
    @ModelAttribute("students")
    List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/allChoose")
    public String start(){
        return "allChoose";
    }
}
