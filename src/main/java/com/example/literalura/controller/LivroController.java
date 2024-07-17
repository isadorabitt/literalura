package com.example.literalura.controller;

import com.example.literalura.model.Livro;
import com.example.literalura.repository.LivroRepository;
import com.example.literalura.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private GutendexService gutendexService;

    @GetMapping
    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @GetMapping("/buscar")
    public Livro buscarLivro(@RequestParam String titulo) {
        Livro livro = gutendexService.buscarLivroPorTitulo(titulo);
        return livroRepository.save(livro);
    }
}
