package jedi.academy.service;

import jedi.academy.entity.Power;
import jedi.academy.entity.School;

import java.util.List;

public interface PowerService {

    void save(Power power);

    void update(Power power);

    Power find(Long id);

    void delete(Long id);

    List<Power> findAll();
}
