package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Student;
import br.com.felipelima.web.services.StudentService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
