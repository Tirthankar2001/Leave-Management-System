package com.project.lms.repository;

import com.project.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository< User, Long > {
    User findByEmail(String email);
}
