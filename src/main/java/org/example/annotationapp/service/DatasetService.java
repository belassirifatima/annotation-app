package org.example.annotationapp.service;

import org.example.annotationapp.model.Dataset;
import org.example.annotationapp.repository.DatasetRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DatasetService {

    private final DatasetRepository datasetRepository;

    public DatasetService(DatasetRepository datasetRepository) {
        this.datasetRepository = datasetRepository;
    }

    public Dataset saveDataset(Dataset dataset) {
        dataset.setCreatedAt(LocalDateTime.now());
        return datasetRepository.save(dataset);
    }

    public List<Dataset> getAllDatasets() {
        return datasetRepository.findAll();
    }

    public Dataset getDatasetById(Long id) {
        return datasetRepository.findById(id).orElse(null);
    }

    public void deleteDataset(Long id) {
        datasetRepository.deleteById(id);
    }
}