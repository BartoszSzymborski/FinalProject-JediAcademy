package jedi.academy.controller;

import jedi.academy.entity.Power;
import jedi.academy.entity.Student;
import jedi.academy.service.PowerService;
import jedi.academy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/power")
public class PowerController {
    @Autowired
    private PowerService powerService;
    @Autowired
    private StudentService studentService;

    @ModelAttribute("powers")
    public Collection<Power> powers(){
        List<Power> powers = new ArrayList<>();
        powers.add(new Power("Force jump"));
        powers.add(new Power("Force grip"));
        powers.add(new Power("Force push"));
        powers.add(new Power("Mind trick"));
        powers.add(new Power("Meditation"));
        powers.add(new Power("Lightsaber throw"));
        powers.add(new Power("Force speed"));
        return powers;
    }

    @ModelAttribute("students")
    List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<Power> powers = powerService.findAll();
        model.addAttribute("powers", powers);
        return "powerList";
    }

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("power", new Power());
        return "power";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute @Valid Power power, BindingResult result) {
        if (result.hasErrors()) {
            return "power";
        }
        powerService.save(power);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        powerService.delete(id);
        return "redirect:../list";
    }


    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Power power = powerService.find(id);
        model.addAttribute("power", power);
        return "power";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute @Valid Power power, BindingResult result) {
        if(result.hasErrors()) {
            return "power";
        }
        powerService.update(power);
        return "redirect:../list";
    }

}
