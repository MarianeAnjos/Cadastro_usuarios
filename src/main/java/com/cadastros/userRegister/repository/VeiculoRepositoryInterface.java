package com.cadastros.userRegister.repository;

import com.cadastros.userRegister.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepositoryInterface extends JpaRepository<VeiculoEntity, Integer> {

}
