package com.web.proyecto.inventory.repository;

import com.web.proyecto.inventory.clases.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
