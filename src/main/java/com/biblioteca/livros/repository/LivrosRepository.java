package com.biblioteca.livros.repository;

import com.biblioteca.livros.Model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, String> {

}
