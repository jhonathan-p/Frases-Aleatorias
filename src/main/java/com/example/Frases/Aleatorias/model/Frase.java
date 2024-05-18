package com.example.Frases.Aleatorias.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getPoster() {
        return poster;
    }

}