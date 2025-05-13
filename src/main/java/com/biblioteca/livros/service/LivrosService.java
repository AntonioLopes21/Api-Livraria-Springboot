package com.biblioteca.livros.service;

import com.biblioteca.livros.Model.Livros;
import com.biblioteca.livros.repository.LivrosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivrosService {
    private final LivrosRepository livrosRepository;

    public ResponseEntity<List<Livros>> listarLivros() {
        return ResponseEntity.ok(livrosRepository.findAll());
    }

    public ResponseEntity<Livros> criarLivros(@RequestBody Livros livro) {
        return ResponseEntity.ok(livrosRepository.save(livro));
    }

    public ResponseEntity<Livros> editarLivro(@PathVariable String id, @RequestBody Livros livro) {
        livro.setId(id);
        return ResponseEntity.ok(livrosRepository.save(livro));
    }

    public ResponseEntity<Void> deletarLivro(@PathVariable String id) {
        if(livrosRepository.existsById(id)) {
            livrosRepository.deleteById(id);
        }

        return ResponseEntity.noContent().build();
    }
}
