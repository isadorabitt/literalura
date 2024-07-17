package com.example.literalura.controller;

import com.example.literalura.model.Autor;
import com.example.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    @PostMapping
    public Autor adicionarAutor(@RequestBody Autor autor) {
        return autorRepository.save(autor);
    }
}
