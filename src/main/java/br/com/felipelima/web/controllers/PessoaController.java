package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Pessoa;
import br.com.felipelima.web.services.PessoaService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PessoaController {

    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }
}
