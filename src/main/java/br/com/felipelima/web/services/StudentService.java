package br.com.felipelima.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.felipelima.web.models.Student;
import br.com.felipelima.web.repository.StudentRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
