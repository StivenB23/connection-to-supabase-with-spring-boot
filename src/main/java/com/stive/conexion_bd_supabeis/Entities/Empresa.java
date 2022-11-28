package com.stive.conexion_bd_supabeis.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name =" empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column()
    private String name;
    
    @Column()
    private String address;
    
    @Column()
    private String telephone;
    @Column()
    private String nit;
    @Transient
    private Empleado empleado;

    

    public Empresa() {
    }
    

    public Empresa(String name, String address, String telephone, String nit, Empleado empleado) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.nit = nit;
        this.empleado = empleado;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public Empleado getEmpleado() {
        return empleado;
    }


    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


    @Override
    public String toString() {
        return "Empresa [name=" + name + ", address=" + address + ", telephone=" + telephone + ", nit=" + nit
                + ", empleado=" + this.empleado + "]";
    }

    

    

    
}
