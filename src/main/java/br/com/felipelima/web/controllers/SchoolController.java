package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.School;
import br.com.felipelima.web.services.SchoolService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class SchoolController {
    private SchoolService schoolService;

    @GetMapping("/schools")
    public List<School> findAll() {
        return schoolService.findAll();
    }
}
