package com.example.GreenGo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "projetos")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String impactoSocial;
    private String impactoAmbiental;

    @Column(name = "data_conclusao")
    private LocalDate dataConclusao;

    @ManyToOne
    @JoinColumn(name = "ong_id")
    private PerfilONG ong;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private PerfilEmpresa empresa;
}
