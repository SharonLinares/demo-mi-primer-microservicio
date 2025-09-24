package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

	@GetMapping
	public String consultarPersonas() {
		return "se retorna la lista de personsa";
	}

	@PostMapping
	public String CrearPersona() {
		return "se ha creado  la persona";
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
