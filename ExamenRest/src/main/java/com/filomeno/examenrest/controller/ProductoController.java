package com.filomeno.examenrest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.filomeno.examenrest.model.Producto;

@Controller
@RequestMapping("ExamenREST")
public interface ProductoController {
	@GetMapping("/producto")
	public List<Producto> getProductos();
	@PostMapping("/producto")
	public void addProducto(@RequestBody Producto producto);
	@PutMapping("/producto")
	public void updateProducto(@RequestBody Producto producto);
	@DeleteMapping("/producto")
	public void deleteProducto(@RequestParam long idProducto);
}
