package com.cadastros.userRegister.repository;

import com.cadastros.userRegister.dto.VeiculoDTO;
import org.springframework.stereotype.Component;

@Component
public class VeiculoRepository {
    public  void cadastrarNovoVeiculo(VeiculoDTO veiculoDTO){
        System.out.println("Veiculo salvo no banco de dados");
    }
}
