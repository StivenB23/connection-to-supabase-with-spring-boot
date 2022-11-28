package com.stive.conexion_bd_supabeis.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stive.conexion_bd_supabeis.Entities.Empresa;
import com.stive.conexion_bd_supabeis.Services.ServiceEmpresa;

@RestController
public class EmpresaController {
    
    ServiceEmpresa se1;
    Empresa emp1;

    public EmpresaController(ServiceEmpresa serviceEmpresa){
        this.se1 = serviceEmpresa;
    }

    @GetMapping("/")
    public List<Empresa> information(){
        return this.se1.getReposity();
    }

    @PostMapping("/empresa")
    public Empresa guardar(@RequestBody Empresa emplesa){
        return this.se1.CrearRegistro(emplesa);
    }

}
