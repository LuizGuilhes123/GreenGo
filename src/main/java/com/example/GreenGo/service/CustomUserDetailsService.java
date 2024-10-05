package com.example.GreenGo.service;


import com.example.GreenGo.entity.PerfilEmpresa;
import com.example.GreenGo.repository.EmpresaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final EmpresaRepository empresaRepository;

    public CustomUserDetailsService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        PerfilEmpresa empresa = empresaRepository.findByNome(username);

        if (empresa == null) {
            throw new UsernameNotFoundException("Empresa não encontrada");
        }

        // Supondo que o nome seja o username, sem senha no exemplo.
        return new User(empresa.getNome(), "", Collections.emptyList());
    }
}
