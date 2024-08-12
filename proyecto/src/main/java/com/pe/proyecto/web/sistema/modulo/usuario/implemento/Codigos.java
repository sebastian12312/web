package com.pe.proyecto.web.sistema.modulo.usuario.implemento;

public class Codigos {
    public String codigoUsuario(){
        String codigoUsuario = "";
        StringBuilder contruirString = new StringBuilder();
        char[] numeros = {'A','B','C','D','E','F','G','H','I','J','K','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        contruirString.append(numeros);        
        for(int i = 0 ; i < 10;i ++ ){
            int a = (int)    (Math.random()*  25);       
            char cod = numeros[a];
            codigoUsuario +=   cod;
        }
        //System.out.println(codigoUsuario);
        return  codigoUsuario;
    }
}
