package com.stive.conexion_bd_supabeis.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stive.conexion_bd_supabeis.Entities.Empleado;
import com.stive.conexion_bd_supabeis.Entities.Empresa;
import com.stive.conexion_bd_supabeis.Repositories.RepositoryEmpresa;
@Service
public class ServiceEmpresa {

    // Empresa ep1;
    // ServiceEmpleado se =  new ServiceEmpleado();
    // public  ServiceEmpresa(){
    //     Empleado empleado = this.se.getEmpleado();
    //    this.ep1 = new Empresa("St", "calle 100","3245", "123456789",  empleado);
    // }

    // public Empresa getEmpresa(){
    //     return this.ep1;
    // }

    private RepositoryEmpresa repository;
    public ServiceEmpresa(RepositoryEmpresa repository){
        this.repository = repository;
    }

    public List<Empresa> getReposity(){
        return this.repository.findAll();
    }

    public Empresa CrearRegistro(Empresa empresa){
        return this.repository.save(empresa);
    }
}
