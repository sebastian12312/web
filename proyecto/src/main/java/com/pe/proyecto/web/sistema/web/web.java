package com.pe.proyecto.web.sistema.web;

import com.pe.proyecto.web.sistema.modulo.usuario.implemento.UsuarioImplemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class web {

    @Autowired
    private UsuarioImplemento usuarioImplemento;


    @GetMapping("/")
    public String web() {
        System.out.println("LISTA USUARIOS" + usuarioImplemento.uPrueba());
        usuarioImplemento.

        capicua(2553);
        return "Hola Mundo";
    }

    @GetMapping("/public")
    public String publico() {

        capicua(2553);
        return "Hola soy public";
    }
    @GetMapping("/admin")
    public String admin() {

        capicua(2553);
        return "Hola soy admin";
    }
    @GetMapping("/security")
    public String security() {

        capicua(2553);
        return "Hola soy security";
    }

    public static boolean capicua(int numeroCapicua ){
        String number = String.valueOf(numeroCapicua);       
        boolean esCapicua = true;

        System.out.println("OPERACION");
        for(int i = 0, j = number.length()-1 ; i < number.length(); i++ , j-- ){          
                
            if(number.charAt(i) != number.charAt(j)){
                System.out.print(number.charAt(i) + "-" + number.charAt(j));    
                esCapicua = false;
                break;
            }else{
                System.out.println(number.charAt(i) + "-" + number.charAt(j));    
               
            }
        }
        if(esCapicua == true)
        {
            System.out.println(": ES CAPICUA");
            System.out.println("-------------");
        }else
        {
            System.out.println(": NO ES CAPICUA");
            System.out.println("-------------");
        }
        return true;
    }
    

}
