package com.auxiliar.dieta.model;

import java.time.LocalDateTime;
import java.util.List;

//Entity
public class Refeicao {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDateTime dataHora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    //@ManyToOne
    private Usuario usuario;

    //@ManyToMany
    private List<Receita> receitas;
}
