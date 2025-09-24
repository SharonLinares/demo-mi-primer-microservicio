package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@GetMapping
	public String consultarPersonas() {
		return "se retorna la lista de personas";
	}
	
	@GetMapping("/personaPorDocumento")
	public String consultarPersonaPorDocumento() {
		return "se retorna la persona por documento";
	}

	@PostMapping
	public String crearPersona() {
		return "se ha creado  la persona";
	}
	
	@PostMapping("/crearPersonas")
	public String crearPersonas() {
		return "se ha creado  las personas";
	}

	@PutMapping
	public String ModificarPersona() {
		return "se ha modificado la persona";
	}

	@DeleteMapping
	public String eliminarPersona() {
		return "se ha eliminado a la persona";
	}

}
