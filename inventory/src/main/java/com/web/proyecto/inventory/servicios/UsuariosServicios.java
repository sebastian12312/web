package com.web.proyecto.inventory.servicios;

import com.web.proyecto.inventory.clases.Perfil;
import com.web.proyecto.inventory.clases.Usuario;

import java.util.List;

public interface UsuariosServicios {
    List<Usuario> listarUsuarios ();
    List<Perfil> listarPerfil();

}
