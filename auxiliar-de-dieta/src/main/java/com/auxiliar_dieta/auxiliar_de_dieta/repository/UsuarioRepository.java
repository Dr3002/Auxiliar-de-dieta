package com.auxiliar_dieta.auxiliar_de_dieta.repository;

import com.auxiliar_dieta.auxiliar_de_dieta.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Metodos de Consulta
}
