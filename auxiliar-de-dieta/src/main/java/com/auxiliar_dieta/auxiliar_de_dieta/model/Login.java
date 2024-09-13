package com.auxiliar_dieta.auxiliar_de_dieta.model;

import jakarta.persistence.*;

@Entity
public class Login {

    @Id
    private String login;
    private String senha;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Login() {}

    public Login(String login, String senha, Usuario usuario) {
        this.login = login;
        this.senha = senha;
        this.usuario = usuario;
    }

    // Getters e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Login{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
