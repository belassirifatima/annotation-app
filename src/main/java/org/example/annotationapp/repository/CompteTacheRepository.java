package org.example.annotationapp.repository;

import org.example.annotationapp.model.CompteTache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteTacheRepository extends JpaRepository<CompteTache, Long> {
}