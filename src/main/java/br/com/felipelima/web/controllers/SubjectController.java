package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Subject;
import br.com.felipelima.web.services.SubjectService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/subjects")
@AllArgsConstructor
public class SubjectController {
    private SubjectService subjectService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Subject> subjects = subjectService.findAll();
        return ResponseEntity.ok(subjects);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Subject subject){
        Subject subjectAdded = subjectService.save(subject);
        return ResponseEntity.status(HttpStatus.CREATED).body(subjectAdded);
    }
}
