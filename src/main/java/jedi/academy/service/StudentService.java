package jedi.academy.service;

import jedi.academy.entity.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    void update(Student student);

    Student find(Long id);

    void delete(Long id);

    List<Student> findAll();
}
