package jedi.academy.service;

import jedi.academy.entity.Power;
import jedi.academy.repository.PowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PowerServiceImpl implements PowerService {
   @Autowired
   private PowerRepository powerRepository;

    @Override
    public void save(Power power) {
        powerRepository.save(power);
    }

    @Override
    public void update(Power power) {
        powerRepository.save(power);
    }

    @Override
    public Power find(Long id) {
        return powerRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        powerRepository.deleteById(id);
    }

    @Override
    public List<Power> findAll() {
        return powerRepository.findAll();
    }
}
