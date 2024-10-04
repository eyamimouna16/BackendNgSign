package com.NgSign.TestTechnique.repository;

import com.NgSign.TestTechnique.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    void deleteUserById(Long id);


}
