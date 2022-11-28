package com.stive.conexion_bd_supabeis.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stive.conexion_bd_supabeis.Entities.Empresa;

@Repository
public interface RepositoryEmpresa extends JpaRepository<Empresa, Long> {
    
}
