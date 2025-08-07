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

    @GetMapping
    public String listarUsuarios(){
        return "Todos os usuários cadastrados até o momento:";
    }

    @PostMapping
    public void criarNovoUsuario(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.criarNovoUsuario(usuarioDTO);
    }


}
