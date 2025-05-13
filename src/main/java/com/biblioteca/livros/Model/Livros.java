package com.biblioteca.livros.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "livros")
@Getter
@Setter
@RequiredArgsConstructor
public class Livros {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "titulo")
    private String titulo;
    private String autor;
    private Date ano;
}
