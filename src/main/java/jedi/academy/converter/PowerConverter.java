package jedi.academy.converter;

import jedi.academy.entity.Power;
import jedi.academy.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class PowerConverter implements Converter<String, Power> {
   @Autowired
   private PowerService powerService;

    @Override
    public Power convert(String s) {
        Long id = Long.parseLong(s);
        return powerService.find(id);
    }
}
