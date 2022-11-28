package com.stive.conexion_bd_supabeis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stive.conexion_bd_supabeis.Entities.Empleado;
import com.stive.conexion_bd_supabeis.Entities.Empresa;

@SpringBootApplication
public class ConexionBdSupabeisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConexionBdSupabeisApplication.class, args);
		Empleado emp1 = new Empleado("Stive", "stive@gmail.com","St", "Administrador", null);
		Empresa ep1 = new Empresa("St", "calle 100","3245", "123456789", emp1);
		System.out.println(ep1.toString());
	}

}
