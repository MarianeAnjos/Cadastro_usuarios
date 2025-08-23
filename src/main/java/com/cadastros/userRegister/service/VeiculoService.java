package com.cadastros.userRegister.service;

import com.cadastros.userRegister.dto.VeiculoDTO;
import com.cadastros.userRegister.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    private VeiculoRepository veiculoRepository;
    public VeiculoService(VeiculoRepository veiculoRepository){this.veiculoRepository = veiculoRepository;}

    public void cadastrarNovoVeiculo(VeiculoDTO veiculoDTO){
        if(veiculoDTO.getAno() >= 30){
            veiculoRepository.cadastrarNovoVeiculo(veiculoDTO);
        }else {
            System.out.println("O veículo nao pode ser cadastrado");
        }
    }
}
