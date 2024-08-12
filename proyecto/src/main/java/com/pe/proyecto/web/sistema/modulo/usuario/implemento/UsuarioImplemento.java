package com.pe.proyecto.web.sistema.modulo.usuario.implemento;

import java.util.ArrayList;
import java.util.List;

import com.pe.proyecto.web.sistema.modulo.db_repositorio.UsuarioPruebaRepository;
import com.pe.proyecto.web.sistema.modulo.usuario.clases.UsuarioPrueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pe.proyecto.web.sistema.modulo.db_repositorio.PerfilRepositorio;
import com.pe.proyecto.web.sistema.modulo.db_repositorio.UsuarioRepositorio;
import com.pe.proyecto.web.sistema.modulo.usuario.clases.Perfil;
import com.pe.proyecto.web.sistema.modulo.usuario.clases.Usuario;
import com.pe.proyecto.web.sistema.modulo.usuario.servicio.UsuarioServicio;

@Service
public class UsuarioImplemento implements UsuarioServicio {

    @Autowired
    private PerfilRepositorio perfilRepositorio;

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;



    @Override
    public UsuarioServicio usuario(String id_usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'usuario'");
    }

    @Override
    public List<UsuarioServicio> listaUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listaUsuario'");
    }

    @Override
    public boolean saveNuevoUsuario(Usuario usuario, Perfil perfil) {
        usuarioRepositorio.save(usuario);
        perfilRepositorio.save(perfil);
        return true;
    }

    @Override
    public UsuarioServicio eliminarUsuario(String id_usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarUsuario'");
    }

    @Override
    public Perfil savePerfil(Perfil perfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savePerfil'");
    }


    @Autowired
    private UsuarioPruebaRepository usuarioPruebaRepository;
    @Override
    public List<UsuarioPrueba> uPrueba() {
        List<UsuarioPrueba> uP =(List) usuarioPruebaRepository.findAll();
        return uP;
    }
}
