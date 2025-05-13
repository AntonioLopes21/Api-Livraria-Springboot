package com.biblioteca.livros.controller;

import com.biblioteca.livros.Model.Livros;
import com.biblioteca.livros.service.LivrosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/livraria")
public class LivrosController {

    private final LivrosService livrosService;

    @GetMapping
    public ResponseEntity<List<Livros>> getLivros() {
        return livrosService.listarLivros();
    }

    @PostMapping
    public ResponseEntity<Livros> postLivros(@RequestBody Livros livros) {
        return livrosService.criarLivros(livros);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livros> atualizarLivros(@PathVariable String id, Livros livro) {
        return livrosService.editarLivro(id, livro);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivros(@PathVariable String id) {
        return livrosService.deletarLivro(id);
    }
}
