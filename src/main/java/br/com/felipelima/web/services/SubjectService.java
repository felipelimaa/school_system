package br.com.felipelima.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.felipelima.web.models.Subject;
import br.com.felipelima.web.repository.SubjectRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubjectService {
    private SubjectRepository subjectRepository;

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    public Subject save(Subject subject){
        return subjectRepository.save(subject);
    }
}
