package jedi.academy.controller;

import jedi.academy.entity.Opinion;
import jedi.academy.entity.School;
import jedi.academy.entity.Student;
import jedi.academy.repository.OpinionRepository;
import jedi.academy.service.OpinionService;
import jedi.academy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;

@Controller
@RequestMapping("/opinion")
public class OpinionController {
    @Autowired
    private OpinionService opinionService;
    @Autowired
    private StudentService studentService;

    @Autowired
    Validator validator;

    @ModelAttribute("students")
    List<Student> getStudents() {
        return studentService.findAll();
    }


    @GetMapping("/list")
    public String findAll(Model model) {
        List<Opinion> opinions = opinionService.findAll();
        model.addAttribute("opinions", opinions);
        return "opinionList";
    }

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("opinion", new Opinion());
        return "opinion";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute @Valid Opinion opinion, BindingResult result) {
        if (result.hasErrors()) {
            return "opinion";
        }
        opinionService.save(opinion);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        opinionService.delete(id);
        return "redirect:../list";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Opinion opinion = opinionService.find(id);
        model.addAttribute("opinion", opinion);
        return "opinion";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute @Valid Opinion opinion, BindingResult result) {
        if(result.hasErrors()) {
            return "opinion";
        }
        opinionService.update(opinion);
        return "redirect:../list";
    }
}
