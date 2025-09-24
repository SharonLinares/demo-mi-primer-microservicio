package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductoDto;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@GetMapping("/consultarProductos")
	public String consultarProductos() {
		return "toma tu lista de productos";
	}
	
	@GetMapping("/consultarProductosPorCodigo")
	public String consultarProductosPorCodigo(@RequestParam(required = false) String codigo) {
		return "toma tu producto con codigo: " + codigo;
	}
	
	@GetMapping("/consultarProductosPorNombre/{nombres}")
	public String consultarProductosPorNombre(@PathVariable(name = "nombres") String nombre) {
		return "toma tu producto con nombre: " + nombre;
	}
	
	
	@PostMapping("/crearProductos")
	public String crearProductos(@RequestBody ProductoDto productoDto ) {
		return "se ha creado el producto con el nombre: " + productoDto.getNombre();
	}
	
}
