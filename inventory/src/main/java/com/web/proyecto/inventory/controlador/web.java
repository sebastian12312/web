package com.web.proyecto.inventory.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class web {

    @GetMapping("/")
    public String main(){
        
        return   "web/index";
    }
}
