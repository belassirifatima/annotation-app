package org.example.annotationapp.service;

import org.example.annotationapp.model.CompteTache;
import org.example.annotationapp.repository.CompteTacheRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteTacheService {

    private final CompteTacheRepository compteTacheRepository;

    public CompteTacheService(CompteTacheRepository compteTacheRepository) {
        this.compteTacheRepository = compteTacheRepository;
    }

    public CompteTache saveCompteTache(CompteTache compteTache) {
        return compteTacheRepository.save(compteTache);
    }

    public List<CompteTache> getAllCompteTaches() {
        return compteTacheRepository.findAll();
    }

    public CompteTache getCompteTacheById(Long id) {
        return compteTacheRepository.findById(id).orElse(null);
    }

    public void deleteCompteTache(Long id) {
        compteTacheRepository.deleteById(id);
    }
}