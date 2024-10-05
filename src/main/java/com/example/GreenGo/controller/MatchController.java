package com.example.GreenGo.controller;


import com.example.GreenGo.entity.Match;
import com.example.GreenGo.service.MatchmakingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private final MatchmakingService matchmakingService;

    public MatchController(MatchmakingService matchmakingService) {
        this.matchmakingService = matchmakingService;
    }

    @GetMapping("/realizar")
    public String realizarMatch() {
        return matchmakingService.realizarMatch();
    }

    @GetMapping("/listar")
    public List<Match> listarPartidas() {
        return matchmakingService.listarPartidas();
    }
}

