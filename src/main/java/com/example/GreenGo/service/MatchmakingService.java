package com.example.GreenGo.service;

import com.example.GreenGo.entity.Match;
import com.example.GreenGo.entity.PerfilEmpresa;
import com.example.GreenGo.entity.Projeto;
import com.example.GreenGo.repository.EmpresaRepository;
import com.example.GreenGo.repository.MatchRepository;
import com.example.GreenGo.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingService {

    private final EmpresaRepository empresaRepository;
    private final ProjetoRepository projetoRepository;
    private final MatchRepository matchRepository;

    // Adicionando o MatchRepository no construtor
    public MatchmakingService(EmpresaRepository empresaRepository, ProjetoRepository projetoRepository, MatchRepository matchRepository) {
        this.empresaRepository = empresaRepository;
        this.projetoRepository = projetoRepository;
        this.matchRepository = matchRepository;
    }

    public String realizarMatch() {
        List<PerfilEmpresa> empresas = empresaRepository.findAll();
        List<Projeto> projetos = projetoRepository.findAll();

        for (PerfilEmpresa empresa : empresas) {
            for (Projeto projeto : projetos) {
                if (matchEmpresaProjeto(empresa, projeto)) {
                    return "Match encontrado: " + empresa.getNome() + " com o projeto " + projeto.getNome();
                }
            }
        }
        return "Nenhum match encontrado.";
    }

    private boolean matchEmpresaProjeto(PerfilEmpresa empresa, Projeto projeto) {
        return empresa.getParticipouEmEventosSustentaveis() && Integer.parseInt(projeto.getImpactoAmbiental()) > 50;
    }

    public List<Match> listarPartidas() {
        return matchRepository.findAll();
    }
}
