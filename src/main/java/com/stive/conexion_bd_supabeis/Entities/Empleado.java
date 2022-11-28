package com.stive.conexion_bd_supabeis.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name ="empleado")
public class Empleado {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column()
   private String name;

   @Column()
   private String email;

   @Column()
   private String empresaEmpleadoPertenece;

   @Column()
   private String rolEmpleado;

   @Transient
   private MovimientoDinero movimiento;
    

    public Empleado() {
    }

    public Empleado(String name, String email, String empresaEmpleadoPertenece, String rolEmpleado,
            MovimientoDinero movimiento) {
        this.name = name;
        this.email = email;
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
        this.rolEmpleado = rolEmpleado;
        this.movimiento = movimiento;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getEmpresaEmpleadoPertenece() {
        return empresaEmpleadoPertenece;
    }



    public void setEmpresaEmpleadoPertenece(String empresaEmpleadoPertenece) {
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
    }



    public String getRolEmpleado() {
        return rolEmpleado;
    }



    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public MovimientoDinero getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(MovimientoDinero movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public String toString() {
        return "Empleado [name=" + name + ", email=" + email + ", empresaEmpleadoPertenece=" + empresaEmpleadoPertenece
                + ", rolEmpleado=" + rolEmpleado + ", movimiento=" + this.movimiento + "]";
    }

    
   

}
