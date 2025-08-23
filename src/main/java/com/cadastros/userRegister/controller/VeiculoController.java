package com.cadastros.userRegister.controller;

import com.cadastros.userRegister.dto.VeiculoDTO;
import com.cadastros.userRegister.service.VeiculoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private VeiculoService veiculoService;
    public VeiculoController(VeiculoService veiculoService) {this.veiculoService = veiculoService;}

    @PostMapping
    public void cadastrarNovoVeiculo(@RequestBody VeiculoDTO veiculoDTO){
        if(!veiculoDTO.validarContratoDeEntradaVeiculo()){
            System.out.println("Contrato de entrada inválido");
            return;
        }
        veiculoService.cadastrarNovoVeiculo(veiculoDTO);
    }
}
