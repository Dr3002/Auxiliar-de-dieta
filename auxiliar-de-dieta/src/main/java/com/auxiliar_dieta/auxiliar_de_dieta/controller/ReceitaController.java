package com.auxiliar_dieta.auxiliar_de_dieta.controller;


import com.auxiliar_dieta.auxiliar_de_dieta.model.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.auxiliar_dieta.auxiliar_de_dieta.repository.ReceitaRepository;

import java.util.List;

@Controller
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;

    @GetMapping
    public String listarReceitas(Model model) {
        List<Receita> receitas = receitaRepository.findAll();
        model.addAttribute("receitas", receitas);
        return "receitas";
    }

    @GetMapping("/nova")
    public String novaReceitaForm(Model model) {
        model.addAttribute("receita", new Receita());
        return "formReceita";
    }

    @PostMapping
    public String salvarReceita(@ModelAttribute Receita receita) {
        receitaRepository.save(receita);
        return "redirect:/receitas";
    }

    @GetMapping("/deletar/{id}")
    public String deletarReceita(@PathVariable Long id) {
        receitaRepository.deleteById(id);
        return "redirect:/receitas";
    }
}
