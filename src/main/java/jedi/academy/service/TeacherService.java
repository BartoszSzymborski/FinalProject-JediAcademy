package jedi.academy.service;

import jedi.academy.entity.Teacher;

import java.util.List;

public interface TeacherService {
    void save(Teacher teacher);

    void update(Teacher teacher);

    Teacher find(Long id);

    void delete(Long id);
    List<Teacher> findAll();
}
