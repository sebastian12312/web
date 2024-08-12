package com.pe.proyecto.web.sistema.modulo.usuario.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class UsuarioPrueba {

    @Id
    private int id;
    private String nombre;
    private String apellido;
    private String password;
}
