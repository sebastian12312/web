package com.pe.proyecto.web.sistema.modulo.usuario.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.proyecto.web.sistema.modulo.usuario.clases.Perfil;
import com.pe.proyecto.web.sistema.modulo.usuario.clases.Usuario;
import com.pe.proyecto.web.sistema.modulo.usuario.clases.Usuario_Perfil;
import com.pe.proyecto.web.sistema.modulo.usuario.implemento.Codigos;
import com.pe.proyecto.web.sistema.modulo.usuario.implemento.UsuarioImplemento;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cliente")

public class UsuarioControlador {

    @Autowired
    private UsuarioImplemento usuarioImplemento;

    Codigos codigos = new Codigos();

    @PostMapping("/registrar")
    public ResponseEntity<?> postMethodName() {
        // String codigoUsuario = codigos.codigoUsuario();
        // Usuario usuario = new Usuario();
        // Perfil perfil = new Perfil();
        // perfil.setId_usuario(codigoUsuario);
        
        // usuario.setId_usuario(codigoUsuario);
        // usuario.setId_documento(1);
        // usuario.setNumero_documento("70994268");
        // usuario.setEmail("codigoUsuario");
        // usuario.setId_estado(1);
        // usuario.setUsername("codigoUsuario");

        // usuario_Perfil.setPerfil(perfil);
        // usuario_Perfil.setUsuario(usuario);


        // boolean rp = usuarioImplemento.saveNuevoUsuario(usuario, perfil);


        // if (usuario.getNumero_documento().length() == 8) {
        //     HashMap<String, Usuario_Perfil> hash = new HashMap<>();            
        //     hash.put(usuario.getNumero_documento(), usuario_Perfil);            
        //     return ResponseEntity.ok(hash);
        // } else {
        //     return ResponseEntity.status(501).body("ERROR EL DNI SUPERA EL MAXIMO DE CARACTERES ");
        // }
        return ResponseEntity.ok("usuario_Perfil");
    }

}
