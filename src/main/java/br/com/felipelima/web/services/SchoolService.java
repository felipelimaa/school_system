package br.com.felipelima.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.felipelima.web.models.School;
import br.com.felipelima.web.repository.SchoolRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SchoolService {
    private SchoolRepository schoolRepository;

    public List<School> findAll() {
        return schoolRepository.findAll();
    }
}
