package com.auxiliar.dieta.model;

//Entidade
public class Receita {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int calorias;

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

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}

