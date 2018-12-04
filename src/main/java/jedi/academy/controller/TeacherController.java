package jedi.academy.controller;

import jedi.academy.entity.Student;
import jedi.academy.entity.Teacher;
import jedi.academy.service.StudentService;
import jedi.academy.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private StudentService studentService;

    @Autowired
    Validator validator;

    @ModelAttribute("teachers")
    public Collection<Teacher>teachers(){
        List<Teacher>teachers = new ArrayList<>();
        teachers.add(new Teacher("Qui-Gon Jinn  - Shii-Cho"));
        teachers.add(new Teacher("Anakin Skywalker - Makashi"));
        teachers.add(new Teacher("Obi-Wan Kenobi - Soresu "));
        teachers.add(new Teacher("Yoda  - Ataru"));
        teachers.add(new Teacher("Ki-Adi Mundi Djem So or Shien"));
        teachers.add(new Teacher("Plo Koon -Niman"));
        teachers.add(new Teacher("Mace Windu - Juyo or Vaapad"));
        return teachers;
    }

    @ModelAttribute("students")
    List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<Teacher> teachers = teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teacherList";
    }

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "teacher";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute @Valid Teacher teacher, BindingResult result) {
        if (result.hasErrors()) {
            return "teacher";
        }
        teacherService.save(teacher);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        teacherService.delete(id);
        return "redirect:../list";
    }


    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Teacher teacher = teacherService.find(id);
        model.addAttribute("teacher", teacher);
        return "teacher";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute @Valid Teacher teacher, BindingResult result) {
        if(result.hasErrors()) {
            return "teacher";
        }
        teacherService.update(teacher);
        return "redirect:../list";
    }
}
