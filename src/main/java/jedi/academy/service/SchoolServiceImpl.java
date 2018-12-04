package jedi.academy.service;

import jedi.academy.entity.School;
import jedi.academy.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SchoolServiceImpl implements SchoolService  {
    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public void save(School school) {
        schoolRepository.save(school);
    }

    @Override
    public void update(School student) {
        schoolRepository.save(student);
    }

    @Override
    public School find(Long id) {
        return schoolRepository.findById(id).orElse(null);
    }


    @Override
    public void delete(Long id) {
        schoolRepository.deleteById(id);
    }

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

}
