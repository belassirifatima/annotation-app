package org.example.annotationapp.Controller;

import org.example.annotationapp.model.Role;
import org.example.annotationapp.model.User;
import org.example.annotationapp.service.UserService;
import org.example.annotationapp.service.DatasetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final DatasetService datasetService;
    private final UserService userService;

    public AdminController(DatasetService datasetService, UserService userService) {
        this.datasetService = datasetService;
        this.userService = userService;
    }

    @GetMapping("/datasets")
    public String showDatasets(Model model) {
        model.addAttribute("datasets", datasetService.getAllDatasets());
        model.addAttribute("newUser", new User());
        return "admin/datasets";
    }

    @PostMapping("/createUser")
    public String createUser(User user) {
        user.setRole(new Role(2L, "ANNOTATOR_ROLE")); // Rôle par défaut
        userService.saveUser(user);
        return "redirect:/admin/datasets";
    }
}