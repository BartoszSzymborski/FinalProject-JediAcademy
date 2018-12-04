package jedi.academy.converter;

import jedi.academy.entity.Student;
import jedi.academy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StudentConverter implements Converter<String, Student> {
    @Autowired
    private StudentService studentService;

    @Override
    public Student convert(String s) {
        Long id = Long.parseLong(s);
        return studentService.find(id);
    }
}
