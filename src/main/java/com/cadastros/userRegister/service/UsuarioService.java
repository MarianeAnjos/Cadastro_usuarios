package com.cadastros.userRegister.service;

import com.cadastros.userRegister.dto.UsuarioDTO;
import com.cadastros.userRegister.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    // Injecao de dependência
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository){this.usuarioRepository = usuarioRepository; }

    public void criarNovoUsuario(UsuarioDTO usuarioDTO){
        if (usuarioDTO.getIdade() >= 18){
            usuarioRepository.criarNovoUsuario(usuarioDTO);
        } else {
            System.out.println("Usuario menor de idade");
        }
    }
}
