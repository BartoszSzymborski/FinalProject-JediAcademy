package jedi.academy.converter;

import jedi.academy.entity.Opinion;
import jedi.academy.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class OpionConverter implements Converter<String, Opinion> {
  @Autowired
  private OpinionService opinionService;

    @Override
    public Opinion convert(String s) {
        Long id = Long.parseLong(s);
        return opinionService.find(id);
    }
}
