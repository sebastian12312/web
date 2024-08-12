package com.pe.proyecto.web.sistema.modulo.usuario.servicio;

import java.util.List;

import com.pe.proyecto.web.sistema.modulo.usuario.clases.Perfil;
import com.pe.proyecto.web.sistema.modulo.usuario.clases.Usuario;
import com.pe.proyecto.web.sistema.modulo.usuario.clases.UsuarioPrueba;

public interface UsuarioServicio {
    UsuarioServicio usuario(String id_usuario);
    List<UsuarioServicio> listaUsuario();
    boolean saveNuevoUsuario(Usuario usuario, Perfil perfil);
    UsuarioServicio eliminarUsuario(String id_usuario);
    Perfil savePerfil(Perfil perfil);
    List<UsuarioPrueba> uPrueba();
}
