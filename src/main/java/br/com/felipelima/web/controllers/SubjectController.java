package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Subject;
import br.com.felipelima.web.services.SubjectService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class SubjectController {
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public List<Subject> findAll() {
        return subjectService.findAll();
    }
}
