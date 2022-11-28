package com.stive.conexion_bd_supabeis.Services;

import com.stive.conexion_bd_supabeis.Entities.Empleado;

public class ServiceEmpleado {
    Empleado emp1;
    public ServiceEmpleado(){
        this.emp1 = new Empleado("Stive", "stive@gmail.com","St", "Administrador", null);

    }

    public Empleado getEmpleado(){
        return this.emp1;
    }
}
