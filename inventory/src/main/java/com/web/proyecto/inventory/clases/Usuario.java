package com.web.proyecto.inventory.clases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {
    @Id
    @Column(name = "usuario_id")
    private String usuario_id;

    @Column(name = "tipo_documento")
    private int tipo_documento;

    @Column(name = "numero_documento")
    private String numero_documento;

    @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    @Column(name = "hora_creacion")
    private Time hora_creacion;

}
