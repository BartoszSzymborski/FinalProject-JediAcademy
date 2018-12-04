package jedi.academy.repository;

import jedi.academy.entity.Student;
import jedi.academy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Student findByLogin(String login);
}
