package com.web.proyecto.inventory.implementos;

import com.web.proyecto.inventory.clases.Perfil;
import com.web.proyecto.inventory.clases.Usuario;
import com.web.proyecto.inventory.repository.PerfilRepository;
import com.web.proyecto.inventory.repository.UsuarioRepository;
import com.web.proyecto.inventory.servicios.UsuariosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorImplemento implements  UsuariosServicios{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PerfilRepository perfilRepository;


    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> listaUsuario = usuarioRepository.findAll();
        return listaUsuario;
    }

    @Override
    public List<Perfil> listarPerfil() {
        List<Perfil> listaPerfil = perfilRepository.findAll();

        return listaPerfil;
    }
}
