package com.web.proyecto.inventory.controlador;


import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.web.proyecto.inventory.clases.LoginUsuario;
import com.web.proyecto.inventory.clases.Perfil;
import com.web.proyecto.inventory.implementos.AutenticacionImplemento;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.awt.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@Slf4j
@RestController
@RequestMapping("/api/auth")
public class Autenticacion {
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SS, dd-MM-yyyy");

    private static final Logger log = LoggerFactory.getLogger(Autenticacion.class);
    @Autowired
    private AutenticacionImplemento autenticacionImplemento;

    @PostMapping("/login")
    public ResponseEntity<?> iniciarSesion(@RequestBody LoginUsuario loginUsuario){
        HashMap<String , String> has =new HashMap();

        //log.info("RESPUESTA" + loginUsuario);
        LoginUsuario login = loginUsuario;

        Perfil validacionPerfil = autenticacionImplemento.autenticarUsuario(login.numero_documento, login.password);

        if(validacionPerfil != null){
            has.put("nombre:", validacionPerfil.nombre );
            has.put("apellido_paterno: " , validacionPerfil.primer_apellido);
            has.put("apellido_materno: " , validacionPerfil.segundo_apellido);
            has.put("correo_electronico:", validacionPerfil.correo_electronico );
            has.put("role:", "adminitrador" );

            return ResponseEntity.ok(has);
        }else{
            has.put("time", localDateTime.format(formatter));
            has.put("error", HttpStatus.BAD_REQUEST.name().toString());
            has.put("message", "INTENTE DE NUEVO");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(has);
        }
    }
}
