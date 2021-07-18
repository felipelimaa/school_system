package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Student;
import br.com.felipelima.web.services.StudentService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok(students);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student){
        Student studentAdded = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentAdded);
    }
}
