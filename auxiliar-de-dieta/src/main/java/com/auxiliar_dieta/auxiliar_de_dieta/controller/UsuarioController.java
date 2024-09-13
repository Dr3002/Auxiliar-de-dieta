package com.auxiliar_dieta.auxiliar_de_dieta.controller;

import com.auxiliar_dieta.auxiliar_de_dieta.model.Usuario;
import com.auxiliar_dieta.auxiliar_de_dieta.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute Usuario usuario, Model model) {
        usuarioRepository.save(usuario);
        model.addAttribute("message", "Usuário registrado com sucesso!");
        return "login";
    }
}
