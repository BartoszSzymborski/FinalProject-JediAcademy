package jedi.academy.service;

import jedi.academy.entity.Opinion;
import jedi.academy.repository.OpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OpinionServiceImpl implements OpinionService {
    @Autowired
    private OpinionRepository opinionRepository;
    @Override
    public void save(Opinion opinion) {
        opinionRepository.save(opinion);
    }

    @Override
    public void update(Opinion opinion) {
        opinionRepository.save(opinion);
    }

    @Override
    public Opinion find(Long id) {
        return opinionRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        opinionRepository.deleteById(id);
    }

    @Override
    public List<Opinion> findAll() {
        return opinionRepository.findAll();
    }
}
