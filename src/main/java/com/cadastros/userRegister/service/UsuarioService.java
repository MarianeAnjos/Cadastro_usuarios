package com.cadastros.userRegister.service;

import com.cadastros.userRegister.dto.UsuarioDTO;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public void criarNovoUsuario(UsuarioDTO usuarioDTO){
        if (usuarioDTO.getIdade() >= 18){
            System.out.println(usuarioDTO);
        } else {
            System.out.println("Usuario menor de idade");
        }
    }
}
