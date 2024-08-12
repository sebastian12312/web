package com.pe.proyecto.web.sistema.modulo.db_repositorio;

import com.pe.proyecto.web.sistema.modulo.usuario.clases.UsuarioPrueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPruebaRepository extends JpaRepository<UsuarioPrueba, Integer> {

}
