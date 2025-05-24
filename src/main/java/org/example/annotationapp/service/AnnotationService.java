package org.example.annotationapp.service;

import org.example.annotationapp.model.Annotation;
import org.example.annotationapp.repository.AnnotationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnnotationService {

    private final AnnotationRepository annotationRepository;

    public AnnotationService(AnnotationRepository annotationRepository) {
        this.annotationRepository = annotationRepository;
    }

    public Annotation saveAnnotation(Annotation annotation) {
        annotation.setTimestamp(LocalDateTime.now());
        return annotationRepository.save(annotation);
    }

    public List<Annotation> getAllAnnotations() {
        return annotationRepository.findAll();
    }

    public Annotation getAnnotationById(Long id) {
        return annotationRepository.findById(id).orElse(null);
    }

    public void deleteAnnotation(Long id) {
        annotationRepository.deleteById(id);
    }
}