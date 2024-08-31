package com.web.proyecto.inventory.servicios;

import com.web.proyecto.inventory.clases.Perfil;
import com.web.proyecto.inventory.clases.Usuario;

public interface AutenticacionUsuarioservicio {

    Perfil autenticarUsuario(String numero_documento, String password);
}
