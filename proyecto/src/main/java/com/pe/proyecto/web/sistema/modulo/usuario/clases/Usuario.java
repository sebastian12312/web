package com.pe.proyecto.web.sistema.modulo.usuario.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    private String id_usuario;
    private int id_documento;
    private String numero_documento;
    private String username;
    private String email;
    private String contrasena;
    private int id_estado;
}
