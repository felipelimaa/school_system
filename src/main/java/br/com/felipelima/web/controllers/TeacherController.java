package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Teacher;
import br.com.felipelima.web.services.TeacherService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("teachers")
@AllArgsConstructor
public class TeacherController {
    private TeacherService teacherService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Teacher> teachers = teacherService.findAll();
        return ResponseEntity.ok(teachers);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Teacher teacher) {
        Teacher teacherAdded = teacherService.save(teacher);
        return ResponseEntity.status(HttpStatus.CREATED).body(teacherAdded);
    }
}
