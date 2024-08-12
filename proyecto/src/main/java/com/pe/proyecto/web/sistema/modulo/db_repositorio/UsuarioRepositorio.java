package com.pe.proyecto.web.sistema.modulo.db_repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.proyecto.web.sistema.modulo.usuario.clases.Usuario;

@Repository
public interface  UsuarioRepositorio extends JpaRepository<Usuario, String>{
    
}
