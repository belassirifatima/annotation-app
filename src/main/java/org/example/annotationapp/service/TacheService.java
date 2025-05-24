package org.example.annotationapp.service;

import org.example.annotationapp.model.Tache;
import org.example.annotationapp.repository.TacheRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheService {

    private final TacheRepository tacheRepository;

    public TacheService(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }

    public Tache saveTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    public List<Tache> getAllTaches() {
        return tacheRepository.findAll();
    }

    public Tache getTacheById(Long id) {
        return tacheRepository.findById(id).orElse(null);
    }

    public void deleteTache(Long id) {
        tacheRepository.deleteById(id);
    }
}