package com.freelawise.infrastructure.persistence;

import com.freelawise.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional findByEmail(String email);
    boolean existsByEmail(String email);
}
