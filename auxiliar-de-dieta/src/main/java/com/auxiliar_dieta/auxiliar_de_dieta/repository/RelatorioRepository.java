package com.auxiliar_dieta.auxiliar_de_dieta.repository;

import com.auxiliar_dieta.auxiliar_de_dieta.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
}
