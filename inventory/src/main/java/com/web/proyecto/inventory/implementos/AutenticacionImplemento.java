package com.web.proyecto.inventory.implementos;


import com.web.proyecto.inventory.clases.Perfil;
import com.web.proyecto.inventory.repository.PerfilRepository;
import com.web.proyecto.inventory.servicios.AutenticacionUsuarioservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionImplemento implements AutenticacionUsuarioservicio {

    @Autowired
    private PerfilRepository perfilRepository;


    @Override
    public Perfil autenticarUsuario(String numero_documento, String password) {
        Perfil perfil = perfilRepository.findByUsernameAndPassword(numero_documento,password);
        if(perfil != null){
            return perfil;
        }else{
            return null;
        }
    }
}
