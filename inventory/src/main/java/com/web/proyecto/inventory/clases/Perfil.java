package com.web.proyecto.inventory.clases;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "perfil")
public class Perfil {


    @Id
    @Column(name = "numero_documento")
    public String numero_documento;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "primer_apellido")
    public String primer_apellido;

    @Column(name = "segundo_apellido")
    public String segundo_apellido;

    @Column(name = "correo_electronico")
    public String correo_electronico;

    @Column(name = "estados_id")
    public int estados_id;

    @Column(name = "role")
    public int role;

    @Column(name = "password")
    public String password;

}
