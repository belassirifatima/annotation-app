package org.example.annotationapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "annotation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Annotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classChoisie; // Label choisi par l'annotateur
    @ManyToOne
    private User utilista;
    @ManyToOne
    private Tache tache;
    @ManyToOne
    private CompteTache compteTache;
    private LocalDateTime timestamp;
}