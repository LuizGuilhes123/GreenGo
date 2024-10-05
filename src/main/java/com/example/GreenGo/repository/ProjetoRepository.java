package com.example.GreenGo.repository;


import com.example.GreenGo.entity.PerfilEmpresa;
import com.example.GreenGo.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    List<Projeto> findByEmpresa(PerfilEmpresa empresa);

    // Obter projetos realizados pela empresa nos últimos N meses
    @Query("SELECT p FROM Projeto p WHERE p.empresa = :empresa AND p.dataConclusao >= :dataLimite")
    List<Projeto> findProjetosRecentesPorEmpresa(@Param("empresa") PerfilEmpresa empresa, @Param("dataLimite") LocalDate dataLimite);
}