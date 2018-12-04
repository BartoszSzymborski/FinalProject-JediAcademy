package jedi.academy.converter;

import jedi.academy.entity.School;
import jedi.academy.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class SchoolConverter implements Converter<String, School> {

    @Autowired
    private SchoolService schoolService;

    @Override
    public School convert(String s) {
        Long id = Long.parseLong(s);
        return schoolService.find(id);
    }
}
