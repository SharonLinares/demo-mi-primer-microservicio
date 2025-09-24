package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@GetMapping("/consultarProductos")
	public String consultarProductos() {
		return "toma tu lista de productos";
	}
}
