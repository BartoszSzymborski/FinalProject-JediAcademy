package jedi.academy.controller;

import jedi.academy.entity.School;
import jedi.academy.entity.Student;
import jedi.academy.service.SchoolService;
import jedi.academy.service.StudentService;
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
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;
    @Autowired
    private StudentService studentService;
    @Autowired
    Validator validator;

    @ModelAttribute("schools")
    public Collection<School> schools(){
        List<School>schools = new ArrayList<>();
        schools.add(new School("Blue"));
        schools.add(new School("Green"));
        schools.add(new School("Red"));
        schools.add(new School("Yellow"));
        schools.add(new School("Purple"));
        schools.add(new School("Black"));
        schools.add(new School("White"));
        return schools;
    }

    @ModelAttribute("students")
    List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<School> schools = schoolService.findAll();
        model.addAttribute("schools", schools);
        return "schoolList";
    }

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("school", new School());
        return "school";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute @Valid School school, BindingResult result) {
        if (result.hasErrors()) {
            return "school";
        }
        schoolService.save(school);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        schoolService.delete(id);
        return "redirect:../list";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        School school = schoolService.find(id);
        model.addAttribute("school", school);
        return "school";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute @Valid School school, BindingResult result) {
        if(result.hasErrors()) {
            return "school";
        }
        schoolService.update(school);
        return "redirect:../list";
    }
}
