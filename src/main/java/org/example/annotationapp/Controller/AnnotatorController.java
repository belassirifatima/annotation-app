package org.example.annotationapp.Controller;

import org.example.annotationapp.service.TacheService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/annotator")
public class AnnotatorController {

    private final TacheService tacheService;

    public AnnotatorController(TacheService tacheService) {
        this.tacheService = tacheService;
    }

    @GetMapping("/tasks")
    public String showTasks(Model model) {
        model.addAttribute("tasks", tacheService.getAllTaches());
        return "annotator/tasks";
    }
}