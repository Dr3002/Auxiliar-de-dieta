package com.auxiliar_dieta.auxiliar_de_dieta.controller;

import com.auxiliar_dieta.auxiliar_de_dieta.model.Login;
import com.auxiliar_dieta.auxiliar_de_dieta.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute Login login, Model model) {
        Login foundLogin = loginRepository.findById(login.getLogin()).orElse(null);
        if (foundLogin != null && foundLogin.getSenha().equals(login.getSenha())) {
            model.addAttribute("message", "Login realizado com sucesso!");
            return "home"; // Página de sucesso após o login
        } else {
            model.addAttribute("error", "Login ou senha incorretos!");
            return "login";
        }
    }
}
