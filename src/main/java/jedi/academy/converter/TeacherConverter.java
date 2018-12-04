package jedi.academy.converter;

import jedi.academy.entity.Teacher;
import jedi.academy.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class TeacherConverter implements Converter<String, Teacher> {

    @Autowired
    private TeacherService teacherService;
    @Override
    public Teacher convert(String s) {
        Long id = Long.parseLong(s);
        return teacherService.find(id);
    }
}
