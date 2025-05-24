package org.example.annotationapp.repository;

import org.example.annotationapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Remplace findByNom
}