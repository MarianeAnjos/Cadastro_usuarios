package com.cadastros.userRegister.repository;

import com.cadastros.userRegister.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepository {

    public void criarNovoUsuario(UsuarioDTO usuarioDTO){
        System.out.println("Usuario Salvo no banco de dados");
    }
}
