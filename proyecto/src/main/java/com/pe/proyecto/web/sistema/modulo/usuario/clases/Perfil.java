package com.pe.proyecto.web.sistema.modulo.usuario.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    private String id_usuario;
    private String nombre;
    private String primera_apellido;
    private String segundo_apellido;
    private double saldo;
    private String pais;
    private String telefono;
    private String fecha_nacimiento;
    private String perfil_img;
    private int id_genero;
    private int id_role;
}
