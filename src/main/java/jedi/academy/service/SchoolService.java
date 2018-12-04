package jedi.academy.service;

import jedi.academy.entity.School;

import java.util.List;

public interface SchoolService {
    void save(School school);

    void update(School student);

    School find(Long id);

    void delete(Long id);

    List<School> findAll();

}
