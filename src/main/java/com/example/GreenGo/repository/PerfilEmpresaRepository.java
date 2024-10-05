package com.example.GreenGo.repository;

import com.example.GreenGo.entity.PerfilEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilEmpresaRepository extends JpaRepository<PerfilEmpresa, Long> {
    PerfilEmpresa findByNome(String nome);
}
