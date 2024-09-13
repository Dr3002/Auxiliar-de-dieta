package com.auxiliar_dieta.auxiliar_de_dieta.repository;

import com.auxiliar_dieta.auxiliar_de_dieta.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, String> {
}
