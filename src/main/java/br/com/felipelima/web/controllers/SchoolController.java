package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.School;
import br.com.felipelima.web.services.SchoolService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/schools")
@AllArgsConstructor
public class SchoolController {
    private SchoolService schoolService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<School> schools = schoolService.findAll();
        return ResponseEntity.ok(schools);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody School school) {
        School schoolAdded = schoolService.save(school);
        return ResponseEntity.status(HttpStatus.CREATED).body(schoolAdded);
    }
}
