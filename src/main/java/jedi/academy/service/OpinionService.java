package jedi.academy.service;

import jedi.academy.entity.Opinion;
import jedi.academy.entity.School;

import java.util.List;

public interface OpinionService {

    void save(Opinion opinion);

    void update(Opinion opinion);

    Opinion find(Long id);

    void delete(Long id);

    List<Opinion> findAll();
}
