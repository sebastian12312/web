package com.web.proyecto.inventory.repository;

import com.web.proyecto.inventory.clases.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {
    @Query("SELECT u FROM Perfil u WHERE u.numero_documento = :numero_documento AND u.password = :password")
    Perfil findByUsernameAndPassword(@Param("numero_documento") String username, @Param("password") String password);

}
