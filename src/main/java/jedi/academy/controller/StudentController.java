package jedi.academy.controller;

import jedi.academy.entity.School;
import jedi.academy.entity.Student;
import jedi.academy.entity.Teacher;
import jedi.academy.service.StudentService;
import jedi.academy.service.TeacherService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/student")
@SessionScope
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    Validator validator;

    @ModelAttribute("teacher")
    public List<Teacher> getTeacher() {
        return teacherService.findAll();
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "studentList";
    }

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute @Valid Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "student";
        }
        studentService.save(student);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        studentService.delete(id);
        return "redirect:../list";
    }


    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Student student = studentService.find(id);
        model.addAttribute("student", student);
        return "student";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute @Valid Student student, BindingResult result) {
        if(result.hasErrors()) {
            return "student";
        }
        studentService.update(student);
        return "redirect:../list";
    }




}
