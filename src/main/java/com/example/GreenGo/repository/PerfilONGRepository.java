package com.example.GreenGo.repository;

import com.example.GreenGo.entity.PerfilONG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilONGRepository extends JpaRepository<PerfilONG, Long> {
}
