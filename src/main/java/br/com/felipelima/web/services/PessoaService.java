package br.com.felipelima.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.felipelima.web.models.Pessoa;
import br.com.felipelima.web.repository.PessoaRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaService {
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }
}
