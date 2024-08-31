package com.web.proyecto.inventory.controlador;

import com.web.proyecto.inventory.clases.Perfil;
import com.web.proyecto.inventory.clases.Usuario;
import com.web.proyecto.inventory.implementos.AdministradorImplemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class web {
    @Autowired
    private AdministradorImplemento administradorImplemento;

    @GetMapping("/")
    public ResponseEntity<?> listaUsairo(){
        List<Usuario> lista = administradorImplemento.listarUsuarios();
        List<Perfil> perfil = administradorImplemento.listarPerfil();
        HashMap<Integer , List<Usuario>> has = new HashMap();
        HashMap<Integer , List<Perfil>> has2 = new HashMap();
        has.put(1,lista);
        has2.put(1,perfil);

        System.out.println("LISTA PERFIL" + perfil);
        System.out.println("LISTA USUARIO" + lista);

        return ResponseEntity.ok(has2);
    }
}
