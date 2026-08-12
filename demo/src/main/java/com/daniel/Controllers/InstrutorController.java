package com.daniel.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.daniel.entities.Instrutor;
import com.daniel.repositories.InstrutorRepository;


@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    @Autowired
    private InstrutorRepository repository;

    @GetMapping
    public List<Instrutor> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Instrutor salvar(@RequestBody Instrutor instrutor) {
        return repository.save(instrutor);
    }

}