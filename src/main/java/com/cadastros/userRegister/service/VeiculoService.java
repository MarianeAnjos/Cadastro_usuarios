package com.cadastros.userRegister.service;

import com.cadastros.userRegister.dto.VeiculoDTO;
import com.cadastros.userRegister.entity.VeiculoEntity;
import com.cadastros.userRegister.repository.VeiculoRepository;
import com.cadastros.userRegister.repository.VeiculoRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {
    private VeiculoRepository veiculoRepository;
    private VeiculoRepositoryInterface veiculoRepositoryInterface;

    public VeiculoService(VeiculoRepository veiculoRepository, VeiculoRepositoryInterface veiculoRepositoryInterface){
        this.veiculoRepository = veiculoRepository;
        this.veiculoRepositoryInterface = veiculoRepositoryInterface;
    }


    public void cadastrarNovoVeiculo(VeiculoDTO veiculoDTO){

        if(veiculoDTO.getAno() >= 30){
            VeiculoEntity veiculoEntity = new VeiculoEntity(veiculoDTO.getAno(),veiculoDTO.getMarca(), veiculoDTO.getNomeDoVeiculo());

            veiculoRepositoryInterface.save(veiculoEntity);
        }else {
            System.out.println("O veículo nao pode ser cadastrado");
        }
    }

    public List<VeiculoDTO> listarVeiculos(){
        var veiculos = veiculoRepositoryInterface.findAll();

        List<VeiculoDTO> veiculoDTOS = new ArrayList<>();

        for(VeiculoEntity veiculo:veiculos){
            VeiculoDTO veiculoDTO = new VeiculoDTO();

            veiculoDTO.setNomeDoVeiculo(veiculo.getNomeDoVeiculo());
            veiculoDTO.setMarca(veiculo.getMarca());
            veiculoDTO.setAno(veiculo.getAno());

            veiculoDTOS.add(veiculoDTO);
        }

        return veiculoDTOS;
    }
}
