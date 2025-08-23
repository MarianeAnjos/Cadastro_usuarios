package com.cadastros.userRegister.controller;

import com.cadastros.userRegister.dto.UsuarioDTO;
import com.cadastros.userRegister.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public void criarNovoUsuario(@RequestBody UsuarioDTO usuarioDTO){
        if (!usuarioDTO.validarContratoDeEntrada()){
            System.out.println("Contrato de entrada inválido");
            return;
        }
        usuarioService.criarNovoUsuario(usuarioDTO);
    }
}
