package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Teacher;
import br.com.felipelima.web.services.TeacherService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TeacherController {
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public List<Teacher> findAll() {
        return teacherService.findAll();
    }
}
