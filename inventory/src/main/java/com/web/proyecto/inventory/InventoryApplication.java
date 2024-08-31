package com.web.proyecto.inventory;

import com.web.proyecto.inventory.clases.Usuario;
import com.web.proyecto.inventory.implementos.AdministradorImplemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

}
