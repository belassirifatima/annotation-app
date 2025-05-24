package org.example.annotationapp.repository;

import org.example.annotationapp.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache, Long> {
}